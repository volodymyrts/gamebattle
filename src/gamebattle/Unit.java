package gamebattle;

abstract class Unit {

    protected String name;
    protected State state;
    protected int maxHealthPoints;

    Unit(int healthPoints, int damage, int magicDamage) {
        state = new State(healthPoints, damage, magicDamage);
        maxHealthPoints = healthPoints;
    }

    public void transform(){};

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void attack(Unit enemy) throws MyException {
        if (!this.isDead() && !enemy.isDead()) {
            System.out.println(getName() + " attacks " + enemy.getName() + " [" + getUnitInfo(enemy) + "]");
            enemy.takeDamage(state.damage, state.magicDamage);
            enemy.counterAttack(this);
        } else {
            try {
                throw new MyException("attacker is dead or trying to attack dead enemy");
            } catch (MyException e) {
                System.out.println("Message: " + e.getMessage());
            }
            //System.out.println(getName() + " attacks dead" + enemy.getName());
        }
    }

    public void counterAttack(Unit attacker) {
        if (!this.isDead() && !attacker.isDead()) {
            System.out.println(getName() + " counterAttacks " + attacker.getName() + " [" + getUnitInfo(attacker) + "]");
            attacker.takeDamage(state.damage/2, state.magicDamage/2);
        } else {
            try {
                throw new MyException("attacker is dead or trying to counterAttack dead enemy");
            } catch (MyException e) {
                System.out.println("Message: " + e.getMessage());
            }
            //System.out.println(getName() + " is dead and can't counterAttack");
        }
    }

    public void takeDamage(int physicalDamage, int magicDamage) {
        int physicalDamage1 = state.takePhysicalDamage(physicalDamage);
        int magicDamage1 = state.takeMagicDamage(magicDamage);
        int summDamage = physicalDamage1 + magicDamage1;
        System.out.println(this.name + " takes " + summDamage + " points of damage " + getUnitInfo(this));
    }

    public void healthUpHalfDamageFromAttack(int healthPoints) {}

    public boolean isDead() {
        return state.healthPoints == 0 ? true : false;
    }

    public String getUnitInfo(Unit unit) {
        if (!unit.isDead()) {
            return "[" + unit.name + ": " + unit.state.healthPoints + " healthpoints left]";
        } else {
            return "Unit " + unit.name + " is dead!";
        }
    }

    @Override
    public String toString() {
        if (!isDead()) {
            return "Unit: " + name + ", hp=" + state.healthPoints + ", dmg=" + state.damage + ", mDmg=" + state.magicDamage;
        } else {
            return "Unit: " + name + " is dead, dmg=" + state.damage + ", mDmg=" + state.magicDamage;
        }

    }
    
}
