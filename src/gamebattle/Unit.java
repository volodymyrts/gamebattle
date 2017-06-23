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
        enemy.takeDamage(state.getPhysicalDamage(), state.getMagicDamage());
        enemy.counterAttack(this);
    }

    public void counterAttack(Unit attacker) {
        System.out.println(getName() + " counterAttacks " + attacker.getName());
        attacker.takePhysicalDamage(state.getPhysicalDamage()/2);
        attacker.takeMagicDamage(state.getMagicDamage()/2);
    }

    public void takeDamage(int physicDamage, int magicDamage) {
        takePhysicalDamage(physicDamage);
        takeMagicDamage(magicDamage);
    }

    public void takePhysicalDamage(int physicalDamage) {
        state.setHealthPoints(state.getHealthPoints() - physicalDamage);
        System.out.println(getName() + " takes " + physicalDamage + " physic damage");
    }

    public void takeMagicDamage(int magicDamage) {
        state.setHealthPoints(state.getHealthPoints() - magicDamage);
        System.out.println(getName() + " takes " + magicDamage + " magic damage");
    }

    public void healthUp() {}

    @Override
    public String toString() {
        return "Unit: " + name + ", hp=" + state.getHealthPoints() + ", pDmg=" + state.getPhysicalDamage() + ", mDmg=" + state.getMagicDamage();
    }
    
}
