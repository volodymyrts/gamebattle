package gamebattle;

public class Vampire extends Unit {

    Vampire() {
        super(110, 0, 12);
        name = "Vampire";
    }

    @Override
    public void attack(Unit enemy) {
        System.out.println(getName() + " attacks " + enemy.getName());
        enemy.takeDamage(state.getDamage());
        enemy.counterAttack(this);
        healthUp();
    }

    @Override
    public void counterAttack(Unit attacker) {
        System.out.println(getName() + " counterAttacks " + attacker.getName());
        attacker.takeDamage(state.getDamage() / 2);
        attacker.takeMagicDamage(state.getMagicDamage() / 2);
        healthUp();
    }

    @Override
    public void healthUp() {
        state.healthPoints = state.healthPoints + state.getDamage() / 2 + state.getMagicDamage() / 2;
        if (state.healthPoints > maxHealthPoints) {
            state.healthPoints = maxHealthPoints;
        }
    }

}
