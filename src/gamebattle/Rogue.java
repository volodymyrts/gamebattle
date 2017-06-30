package gamebattle;

class Rogue extends Unit {

    Rogue() {
        super(80, 10, 0);
        name = "Rogue";
    }

    public void attack(Unit enemy) throws MyException {
        if (this.isDead() || enemy.isDead()) {
            throw new MyException("attacker is dead or trying to attack dead enemy");
        } else {
            System.out.println(getName() + " attacks " + enemy.getName() + getUnitInfo(enemy));
            enemy.takeDamage(state.damage, state.magicDamage);
        }
    }

}
