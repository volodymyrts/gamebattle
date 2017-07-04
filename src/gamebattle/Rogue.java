package gamebattle;

class Rogue extends Unit {

    Rogue() {
        super("Rogue", 80, 80, 10, 0);
    }

    @Override
    public void attack(Unit enemy) throws DeadUnitException, DeadEnemyException {
        if (this.state.getHealthPoints() == 0) {
            throw new DeadUnitException("Attacker is dead");
        }
        if (enemy.state.getHealthPoints() == 0) {
            throw new DeadEnemyException("Trying to attack dead enemy");
        }
        System.out.println(getName() + " attacks " + enemy.getName());
        enemy.takePhysicalDamage(state.getPhysicalDamage());
    }

}
