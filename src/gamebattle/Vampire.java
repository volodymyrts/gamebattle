package gamebattle;

public class Vampire extends Unit {

    Vampire() {
        super(110, 0, 12);
        name = "Vampire";
    }

    @Override
    public void attack(Unit enemy) {
        if (!enemy.isDead()) {
            System.out.println(getName() + " attacks " + enemy.getName());
            int healthPointsBeforeAttack = enemy.state.healthPoints;
            enemy.takeDamage(this.state.damage);
            enemy.takeMagicDamage(this.state.magicDamage);
            if (this.state.damage > healthPointsBeforeAttack) {
                healthUp(healthPointsBeforeAttack/2);
            } else {
                healthUp(state.damage/2);
            }
            if (this.state.magicDamage > healthPointsBeforeAttack) {
                healthUp(healthPointsBeforeAttack/2);
            } else {
                healthUp(state.magicDamage/2);
            }
            enemy.counterAttack(this);
        } else {
            System.out.println(getName() + " attacks dead " + enemy.getName());
        }
    }

    @Override
    public void counterAttack(Unit attacker) {
        if (!isDead()) {
            System.out.println(getName() + " counterAttacks " + attacker.getName());
            int healthPointsBeforeAttack = attacker.state.healthPoints;
            attacker.takeDamage(state.damage/2);
            attacker.takeMagicDamage(state.magicDamage/2);
            if (state.damage/2 > healthPointsBeforeAttack) {
                healthUp(healthPointsBeforeAttack/2);
            } else {
                healthUp(state.damage/2);
            }
            if (this.state.magicDamage/2 > healthPointsBeforeAttack) {
                healthUp(healthPointsBeforeAttack/2);
            } else {
                healthUp(state.magicDamage/2);
            }
        } else {
            System.out.println(getName() + " is dead and can't counterAttack");
        }
    }

    @Override
    public void healthUp(int healthPoints1) {
        System.out.println("healthUp(" + healthPoints1 + ")");
        state.healthPoints = state.healthPoints + healthPoints1;
        if (state.healthPoints > maxHealthPoints) {
            state.healthPoints = maxHealthPoints;
        }
    }

}
