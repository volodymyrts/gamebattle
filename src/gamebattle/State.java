package gamebattle;

public class State {

    public int healthPoints;
    public int damage;
    public int magicDamage;

    State(int healthPoints, int physicalDamage, int magicDamage) {
        this.healthPoints = healthPoints;
        this.damage = physicalDamage;
        this.magicDamage = magicDamage;
    }

    public int takePhysicalDamage(int damage) {
        if (healthPoints <= damage) {
            healthPoints = 0;
            return damage - healthPoints;
        } else {
            healthPoints -= damage;
            return damage;
        }
    }

    public int takeMagicDamage(int damage) {
        return takePhysicalDamage(damage);
    }

}
