package gamebattle;

class Rogue extends Unit {

    Rogue() {
        this.name = "Rogue";
        this.setHealthPoints(80);
        this.setDamage(10);
    }

    @Override
    public void attack(Unit enemy) {
        System.out.println(this.getName() + " attacks " + enemy.getName());
        enemy.takeDamage(this.getDamage());
    }

}
