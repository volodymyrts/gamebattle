package gamebattle;

public class Vampire extends Unit {

    Vampire() {
        super(110, 0, 12);
        name = "Vampire";
    }

    @Override
    public void attack(Unit enemy) {
        System.out.println(getName() + " attacks " + enemy.getName());
        enemy.takeDamage(state.getPhysicalDamage(), state.getMagicDamage());
        enemy.counterAttack(this);
        healthUp();
    }

    @Override
    public void counterAttack(Unit attacker) {
        System.out.println(getName() + " counterAttacks " + attacker.getName());
        attacker.takePhysicalDamage(state.getPhysicalDamage() / 2);
        attacker.takeMagicDamage(state.getMagicDamage() / 2);
        healthUp();
    }

    @Override
    public void healthUp() {
        state.setHealthPoints(state.getHealthPoints() + state.getPhysicalDamage() / 2);
        state.setHealthPoints(state.getHealthPoints() + state.getMagicDamage() / 2);
    }

}
