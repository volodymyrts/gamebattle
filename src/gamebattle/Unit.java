package gamebattle;

abstract class Unit {

    protected String name;
    protected State state;
    protected int maxHealthPoints;

    Unit(int healthPoints, int damage, int magicDamage) {
        state = new State(healthPoints, damage, magicDamage);
        maxHealthPoints = healthPoints;
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
        state.takeDamage(damage);
    }

    public void takeMagicDamage(int magicDamage) {
        state.takeMagicDamage(magicDamage);
    }

    public void healthUp() {}

    @Override
    public String toString() {
        return "Unit: " + name + ", hp=" + state.getHealthPoints() + ", dmg=" + state.getDamage() + ", mDmg=" + state.getMagicDamage();
    }
    
}
