package gamebattle;

abstract class Unit {

    String name;
    int hp;
    int dmg;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDmg() {
        return dmg;
    }

    public void setDmg(int dmg) {
        this.dmg = dmg;
    }

    public void attack(Unit unit) {
        System.out.println(this.getName() + " attacks " + unit.getName() + " with " + this.getDmg());
        unit.hp = unit.hp - this.dmg;
        System.out.println(unit.getName() + " has " + unit.getHp() + " hp left");
        unit.reAttack(this);
    }

    // TODO: replace reAttack(Unit unit) method
    public void attack(Unit unit, Damage damage) {
        System.out.println(this.getName() + " attacks " + unit.getName());
        unit.hp = unit.hp - this.dmg;
        System.out.println(unit.getName() + " gets " + unit.getDmg());
    }
    
    public void reAttack(Unit unit) {
        System.out.println(this.getName() + " reattacks " + unit.getName() + " with " + this.getDmg()/2);
        unit.hp = unit.hp - this.dmg/2;
        System.out.println(unit.getName() + " has " + unit.getHp() + " hp left");
    }
    
    @Override
    public String toString() {
        return "Unit{" + "name=" + name + ", hp=" + hp + ", dmg=" + dmg + "]";
    }
    
}
