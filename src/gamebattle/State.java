package gamebattle;

public class State {

    private String name;
    protected int healthPoints;
    private int maxHealthPoints;
    private int physicalDamage;
    private int magicDamage;

    State(String name, int healthPoints, int maxHealthPoints, int physicalDamage, int magicDamage) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.maxHealthPoints = maxHealthPoints;
        this.physicalDamage = physicalDamage;
        this.magicDamage = magicDamage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getMaxHealthPoints() {
        return maxHealthPoints;
    }

    public int getPhysicalDamage() {
        return physicalDamage;
    }

    public int getMagicDamage() {
        return magicDamage;
    }

    public int takeDamage(int damage) {
        if (damage < 0) {
            System.out.println("damage < 0");
            return 0;
        } else {
            if (healthPoints <= damage) {
                healthPoints = 0;
                System.out.println("takes " + (damage - healthPoints) + " damage");
                return damage - healthPoints;
            } else {
                healthPoints -= damage;
                System.out.println("takes " + damage + " damage");
                return damage;
            }
        }

    }

    public void healthUp(int healthPoints) {
        //bad code TODO: write good code
        if (healthPoints < 0) {
            System.out.println("trying to healthUp with negative healthPoints");
        } else {
            if (maxHealthPoints - this.healthPoints < healthPoints) {
                System.out.println("healthUP " + (maxHealthPoints - this.healthPoints) + " healthpoints (now max level of HealthPoints)");
                this.healthPoints = maxHealthPoints;
            } else {
                System.out.println("healthUP " + healthPoints + " healthpoints");
                this.healthPoints += healthPoints;
            }
        }
    }

}
