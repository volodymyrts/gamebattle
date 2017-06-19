package gamebattle;

class Rogue extends Unit {

    Rogue() {
        this.name = "Rogue";
        this.hp = 80;
        Damage dmg = new PowerDamage(10);
        //this.dmg = 10;
    }
    
    @Override
    public void attack(Unit unit) {
        System.out.println(this.getName() + " attacks " + unit.getName() + " with " + this.getDmg());
        unit.hp = unit.hp - this.dmg;
        System.out.println(unit.getName() + " has " + unit.getHp() + " hp left");
    }

}
