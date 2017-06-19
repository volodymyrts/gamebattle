package gamebattle;

class Rogue extends Unit {

    Rogue() {
        this.name = "Rogue";
        this.healthPoints = 80;
        this.damage = 10;
    }
    
//    @Override
//    public void attack(Unit unit) {
//        System.out.println(this.getName() + " attacks " + unit.getName() + " with " + this.getDamage());
//        unit.hp = unit.hp - this.dmg;
//        System.out.println(unit.getName() + " has " + unit.getHp() + " hp left");
//    }

}
