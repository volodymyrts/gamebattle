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

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void attack(Unit enemy) {
        takeDamage(enemy);
        enemy.counterAttack(this);
//        System.out.println(this.getName() + " attacks " + unit.getName() + " with " + this.getDmg());
//        unit.hp = unit.hp - this.dmg;
//        System.out.println(unit.getName() + " has " + unit.getHp() + " hp left");
//        unit.reAttack(this);
    }

    public void takeDamage(Unit enemy) {
        enemy.healthPoints -= damage;
        System.out.println(this.name + " attacks " + enemy.getName() + " and gives " + this.damage + " damage");
    }

    public void takeHalfDamage(Unit enemy) {
        enemy.healthPoints -= damage/2;
        System.out.println(this.name + " attacks " + enemy.getName() + " and gives " + this.damage/2 + " damage");
    }

    public void takeMagicDamage(Unit enemy) {
        healthPoints -= damage;
        System.out.println(this.name + " attacks " + enemy.getName() + " and gives " + this.damage + " magic damage");
    }
    
    public void counterAttack(Unit atacker) {

            this.takeHalfDamage(atacker);

    }
    
    @Override
    public String toString() {
        return "Unit{" + "name=" + name + ", hp=" + healthPoints + ", dmg=" + damage + "]";
    }
    
}
