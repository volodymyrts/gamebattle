package gamebattle;

abstract class Unit {

    public String name;
    public State state;
    //int healthPoints;
    //int damage;

    Unit(int healthPoints, int damage) {
        this.state = new State();
        this.state.setHealthPoints(healthPoints);
        this.state.setDamage(damage);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void attack(Unit enemy) {
        System.out.println(this.getName() + " attacks " + enemy.getName());
        enemy.takeDamage(this.state.getDamage());
        enemy.counterAttack(this);

    }

    public void takeDamage(int damage) {
        this.state.setHealthPoints(this.state.getHealthPoints() - damage);
        System.out.println(this.getName() + " takes " + this.state.getDamage() + " damage");
    }



    public void takeMagicDamage(Unit enemy) {
        //healthPoints -= damage;
        //System.out.println(this.name + " attacks " + enemy.getName() + " and gives " + this.damage + " magic damage");
    }
    
    public void counterAttack(Unit attacker) {
        System.out.println(this.getName() + " counterAttacks " + attacker.getName());
        attacker.takeDamage(this.state.getDamage()/2);

    }
    
    @Override
    public String toString() {
        return "Unit: " + name + ", hp=" + this.state.getHealthPoints() + ", dmg=" + this.state.getDamage() + "";
    }
    
}
