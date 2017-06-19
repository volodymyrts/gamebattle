package gamebattle;

abstract class Unit {

    String name;
    int healthPoints;
    int damage;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return healthPoints;
    }

    public void setHp(int hp) {
        this.healthPoints = healthPoints;
    }

    public int getDamage() {
        return damage;
    }

    public void setDmg(int dmg) {
        this.damage = damage;
    }

    public void attack(Unit enemy) {
        takeDamage(enemy);
//        System.out.println(this.getName() + " attacks " + unit.getName() + " with " + this.getDmg());
//        unit.hp = unit.hp - this.dmg;
//        System.out.println(unit.getName() + " has " + unit.getHp() + " hp left");
//        unit.reAttack(this);
    }

    public void takeDamage(Unit enemy) {
        healthPoints -= damage;
        System.out.println(this.name + " attacks " + enemy.getName() + " and gives " + this.damage + " damage");
    }

    public void takeMagicDamage(Unit enemy) {
        healthPoints -= damage;
    }

    // TODO: replace attack(Unit unit) method
    public void attack(Unit unit, int damage) {
        System.out.println(this.getName() + " attacks " + unit.getName());
        unit.healthPoints = unit.healthPoints - this.damage;
        System.out.println(unit.getName() + " gets " + unit.getDamage());
    }
    
    public void reAttack(Unit unit) {
        System.out.println(this.getName() + " reattacks " + unit.getName() + " with " + this.getDamage()/2);
        unit.healthPoints = unit.healthPoints - this.damage/2;
        System.out.println(unit.getName() + " has " + unit.getHp() + " hp left");
    }
    
    @Override
    public String toString() {
        return "Unit{" + "name=" + name + ", hp=" + healthPoints + ", dmg=" + damage + "]";
    }
    
}
