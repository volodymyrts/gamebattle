package gamebattle;

abstract class Unit {

    protected State state;

    Unit(String name, int healthPoints, int physicalDamage, int magicDamage, int maxHealthPoints) {
        state = new State(name, healthPoints, physicalDamage, magicDamage, maxHealthPoints);
    }

    public String getName() {
        return state.getName();
    }

    public void setName(String name) {
        state.setName(name);
    }

    public void attack(Unit enemy) throws DeadUnitException, DeadEnemyException {
        if (this.state.getHealthPoints() == 0) {
            throw new DeadUnitException("Attacker is dead");
        }
        if (enemy.state.getHealthPoints() == 0) {
            throw new DeadEnemyException("Trying to attack dead enemy");
        }
        System.out.println(getName() + " attacks " + enemy.getName());
        enemy.takePhysicalDamage(state.getPhysicalDamage());
        //System.out.println(enemy.getName() + " takes " + state.getPhysicalDamage() + " damage " + enemy.toString());
        enemy.counterAttack(this);
    }

    public void counterAttack(Unit attacker) throws DeadUnitException, DeadEnemyException {
        if (this.state.getHealthPoints() == 0) {
            throw new DeadUnitException("Attacker is dead");
        }
        if (attacker.state.getHealthPoints() == 0) {
            throw new DeadEnemyException("Trying to attack dead enemy");
        }
        System.out.println(getName() + " counterAttacks " + attacker.getName());
        attacker.takePhysicalDamage(state.getPhysicalDamage() / 2);
        //System.out.println(attacker.getName() + " takes " + state.getPhysicalDamage()/2 + " damage " + attacker.toString());
    }

    public int takePhysicalDamage(int damage) throws DeadUnitException {
        return state.takePhysicalDamage(damage);
    }

    public int takeMagicDamage(int magicDamage) throws DeadUnitException {
        return state.takeMagicDamage(magicDamage);
    }

    @Override
    public String toString() {
        return "[" + state.getName() + ", hp=" + state.getHealthPoints() + ", maxhp=" + state.getMaxHealthPoints() + ", dmg=" + state.getPhysicalDamage() + ", mDmg=" + state.getMagicDamage() + "]";
    }

    public void changeState() {}
}
