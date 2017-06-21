package gamebattle;

public class State {

    private int healthPoints;
    private int damage;

    State() {
        this.setHealthPoints(0);
        this.setDamage(0);
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

}
