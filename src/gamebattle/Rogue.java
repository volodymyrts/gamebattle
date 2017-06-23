package gamebattle;

class Rogue extends Unit {

    Rogue() {
        super(80, 10, 0);
        name = "Rogue";
    }

    @Override
    public void attack(Unit enemy) {
        System.out.println(getName() + " attacks " + enemy.getName());
        enemy.takePhysicalDamage(state.getPhysicalDamage());
        enemy.takeMagicDamage(state.getMagicDamage());
    }

}
