package gamebattle;

abstract class Unit {

    public String name;
    public State state;

    private static int MAX_HEALTH_POINTS;

    Unit(int healthPoints, int damage, int powerDamage) {
        this.state = new State();
        state.healthPoints = healthPoints;
        state.damage = damage;
        state.powerDamage = powerDamage;
        MAX_HEALTH_POINTS = healthPoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void attack(Unit enemy) {
        System.out.println(this.getName() + " attacks " + enemy.getName());
        enemy.takeDamage(this.state.damage);
        enemy.takeMagicDamage(this.state.powerDamage);
        enemy.counterAttack(this);
    }

    public void counterAttack(Unit attacker) {
        System.out.println(this.getName() + " counterAttacks " + attacker.getName());
        attacker.takeDamage(this.state.damage/2);
        attacker.takeMagicDamage(this.state.powerDamage/2);
    }

    public void takeDamage(int damage) {
        this.state.healthPoints = this.state.healthPoints - damage;
        System.out.println(this.getName() + " takes " + damage + " damage");
    }

    public void takeMagicDamage(int magicDamage) {
        this.state.healthPoints = this.state.healthPoints - magicDamage;
        //this.takeDamage(magicDamage);
        System.out.println(this.getName() + " takes " + magicDamage + " magic damage");
    }
    
    @Override
    public String toString() {
        return "Unit: " + name + ", hp=" + this.state.healthPoints + ", dmg=" + this.state.damage + ", p.dmg=" + this.state.powerDamage;
    }
    
}
