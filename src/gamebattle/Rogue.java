package gamebattle;

class Rogue extends Unit {

    Rogue() {
        super(80, 10, "Power");
        this.name = "Rogue";
    }

    @Override
    public void attack(Unit enemy) {
//        System.out.println(this.getName() + " attacks " + enemy.getName());
//        enemy.takeDamage(this.state.getDamage());
        System.out.println(this.getName() + " attacks " + enemy.getName());

        if (this.getDamageType() == "Power") {
            enemy.takePowerDamage(this.state.getDamage());
        } else {
            enemy.takeMagicDamage(this.state.getDamage());
        }
    }

}
