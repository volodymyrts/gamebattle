package gamebattle;

abstract class Unit {

    public String name;
    public State state;

    private int MAX_HEALTH_POINTS;

    Unit(int healthPoints, int damage, int magicDamage) {
        state = new State(healthPoints, damage, magicDamage);
        MAX_HEALTH_POINTS = healthPoints;
    }

    public void transform(){};

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void attack(Unit enemy) {
        System.out.println(getName() + " attacks " + enemy.getName());
        enemy.takeDamage(state.getDamage());
        enemy.takeMagicDamage(state.getMagicDamage());
        enemy.counterAttack(this);
    }

    public void counterAttack(Unit attacker) {
        System.out.println(getName() + " counterAttacks " + attacker.getName());
        attacker.takeDamage(state.getDamage()/2);
        attacker.takeMagicDamage(state.getMagicDamage()/2);
    }

    public void takeDamage(int damage) {
        state.setHealthPoints(state.getHealthPoints() - damage);
        System.out.println(getName() + " takes " + damage + " damage");
    }

    public void takeMagicDamage(int magicDamage) {
        state.setHealthPoints(state.getHealthPoints() - magicDamage);
        System.out.println(getName() + " takes " + magicDamage + " magic damage");
    }
    
    @Override
    public String toString() {
        return "Unit: " + name + ", hp=" + state.getHealthPoints() + ", dmg=" + state.getDamage() + ", p.dmg=" + state.getMagicDamage();
    }
    
}
