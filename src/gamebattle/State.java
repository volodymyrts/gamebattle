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

    public void takeDamage(int damage) {
        if (healthPoints - damage <= 0) {
            healthPoints = 0;
        } else {
            healthPoints = healthPoints - damage;
        }
    }

    public void takeMagicDamage(int magicDamage) {
        if (healthPoints - magicDamage <= 0) {
            healthPoints = 0;
        } else {
            healthPoints = healthPoints - magicDamage;
        }
    }

}
