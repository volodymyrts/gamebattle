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

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getDamage() {
        return damage;
    }

    public int getMagicDamage() {
        return magicDamage;
    }

    public void takeDamage(int damage) {
        setHealthPoints(getHealthPoints() - damage);
    }

    public void takeMagicDamage(int magicDamage) {
        setHealthPoints(getHealthPoints() - magicDamage);
    }

}
