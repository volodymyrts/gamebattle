package gamebattle;

abstract class Unit {

    public String name;
    public State state;
    private String damageType;

    private static int MAX_HEALTH_POINTS;

    Unit(int healthPoints, int damage, String damageType) {
        this.state = new State();
        this.state.setHealthPoints(healthPoints);
        this.state.setDamage(damage);
        this.setDamageType(damageType);
        MAX_HEALTH_POINTS = healthPoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDamageType() {
        return damageType;
    }

    public void setDamageType(String damageType) {
        this.damageType = damageType;
    }

    public void attack(Unit enemy) {
        System.out.println(this.getName() + " attacks " + enemy.getName());

        if (this.getDamageType() == "Power") {
            enemy.takePowerDamage(this.state.getDamage());
            enemy.counterAttack(this);
        } else {
            enemy.takeMagicDamage(this.state.getDamage());
            enemy.counterAttack(this);
        }
    }

    public void counterAttack(Unit attacker) {
        System.out.println(this.getName() + " counterAttacks " + attacker.getName());

        if (this.getDamageType() == "Power") {
            attacker.takePowerDamage(this.state.getDamage()/2);
        } else {
            attacker.takeMagicDamage(this.state.getDamage()/2);
        }
    }

    public void takeDamage(int damage) {
        this.state.setHealthPoints(this.state.getHealthPoints() - damage);
    }

    public void takePowerDamage(int damage) {
        this.takeDamage(damage);
        System.out.println(this.getName() + " takes " + damage + " power damage");
    }

    public void takeMagicDamage(int damage) {
        this.takeDamage(damage);
        System.out.println(this.getName() + " takes " + damage + " magic damage");
    }
    
    @Override
    public String toString() {
        return "Unit: " + name + ", hp=" + this.state.getHealthPoints() + ", dmg=" + this.state.getDamage() + ", damageType = " + this.getDamageType();
    }
    
}
