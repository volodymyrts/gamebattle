package gamebattle;

abstract class Unit {

    String name;
    State state;
    //int healthPoints;
    //int damage;

    Unit(int healthPoints, int damage) {
        state.setHealthPoints(healthPoints);
        state.setDamage(damage);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPoints() {
        return state.getHealthPoints();
    }

    public void setHealthPoints(int healthPoints) {
        this.state.setHealthPoints(healthPoints);
    }

    public int getDamage() {
        return this.state.getDamage();
    }

    public void setDamage(int damage) {
        this.state.setDamage(damage);
    }

    public void attack(Unit enemy) {
        System.out.println(this.getName() + " attacks " + enemy.getName());
        enemy.takeDamage(this.getDamage());
        enemy.counterAttack(this);

    }

    public void takeDamage(int damage) {
        this.state.setHealthPoints(this.state.getHealthPoints() - damage);
        System.out.println(this.getName() + " takes " + damage + " damage");
    }



    public void takeMagicDamage(Unit enemy) {
        //healthPoints -= damage;
        //System.out.println(this.name + " attacks " + enemy.getName() + " and gives " + this.damage + " magic damage");
    }
    
    public void counterAttack(Unit atacker) {
        System.out.println(this.getName() + " counterAttacks " + atacker.getName());
        atacker.takeDamage(this.state.getDamage()/2);

    }
    
    @Override
    public String toString() {
        return "Unit: " + name + ", hp=" + state.getHealthPoints() + ", dmg=" + state.getDamage() + "";
    }
    
}
