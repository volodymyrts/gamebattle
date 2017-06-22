package gamebattle;

class Rogue extends Unit {

    Rogue() {
        super(80, 10, 0);
        this.name = "Rogue";
    }

    @Override
    public void attack(Unit enemy) {
        System.out.println(this.getName() + " attacks " + enemy.getName());
        enemy.takeDamage(this.state.damage);
        enemy.takeMagicDamage(this.state.powerDamage);
    }

}
