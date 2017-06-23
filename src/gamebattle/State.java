package gamebattle;

public class State {

    private int healthPoints;
    private int damage;
    private int magicDamage;

    State(int healthPoints, int damage, int magicDamage) {
        this.healthPoints = healthPoints;
        this.damage = damage;
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

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getMagicDamage() {
        return magicDamage;
    }

    public void setMagicDamage(int magicDamage) {
        this.magicDamage = magicDamage;
    }

}
