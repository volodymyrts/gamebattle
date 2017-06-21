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
        System.out.println(this.getName() + " attacks " + enemy.getName());
        enemy.takeDamage(this.getDamage());
        enemy.counterAttack(this);

    }

    public void takeDamage(int damage) {
        this.healthPoints -= damage;
        System.out.println(this.getName() + " takes " + damage + " damage");
    }



    public void takeMagicDamage(Unit enemy) {
        healthPoints -= damage;
        System.out.println(this.name + " attacks " + enemy.getName() + " and gives " + this.damage + " magic damage");
    }
    
    public void counterAttack(Unit atacker) {
        System.out.println(this.getName() + " counterAttacks " + atacker.getName());
        atacker.takeDamage(this.getDamage()/2);

    }
    
    @Override
    public String toString() {
        return "Unit: " + name + ", hp=" + healthPoints + ", dmg=" + damage + "";
    }
    
}
