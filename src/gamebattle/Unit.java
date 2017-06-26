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
        if (!enemy.isDead()) {
            System.out.println(getName() + " attacks " + enemy.getName() + enemy.toString());
            enemy.takeDamage(state.damage);
            enemy.takeMagicDamage(state.magicDamage);
            enemy.counterAttack(this);
        } else {
            System.out.println(getName() + " attacks dead" + enemy.getName());
        }
    }

    public void counterAttack(Unit attacker) {
        if (!isDead()) {
            System.out.println(getName() + " counterAttacks " + attacker.getName() + attacker.toString());
            attacker.takeDamage(state.damage/2);
            attacker.takeMagicDamage(state.magicDamage/2);
        } else {
            System.out.println(getName() + " is dead and can't counterAttack");
        }
    }

    public void takeDamage(int damage) {
        if (!isDead()) {
            state.takeDamage(damage);
            System.out.println(this.name + " takes " + damage + " damage (left " + state.healthPoints + " healthpoints)");
        } else {
            System.out.println(this.getName() + " is dead");
        }
    }

    public void takeMagicDamage(int magicDamage) {
        if (!isDead()) {
            state.takeMagicDamage(magicDamage);
            System.out.println(this.name + " takes " + magicDamage + " damage (left " + state.healthPoints + " healthpoints)");
        } else {
            System.out.println(this.getName() + " is dead");
        }
    }

    public void healthUp(int healthPoints) {}

    public boolean isDead() {
        return state.healthPoints == 0 ? true : false;
    }

    @Override
    public String toString() {
        if (!isDead()) {
            return "Unit: " + name + ", hp=" + state.healthPoints + ", dmg=" + state.damage + ", mDmg=" + state.magicDamage;
        } else {
            return "Unit: " + name + " is dead, dmg=" + state.damage + ", mDmg=" + state.magicDamage;
        }

    }
    
}
