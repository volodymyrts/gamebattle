package gamebattle;

public class Vampire extends Unit {

    Vampire() {
        super("Vampire", 110, 110, 0, 12);
    }

    @Override
    public void attack(Unit enemy) throws DeadUnitException, DeadEnemyException {
        if (this.state.getHealthPoints() == 0) {
            throw new DeadUnitException("Attacker is dead");
        }
        if (enemy.state.getHealthPoints() == 0) {
            throw new DeadEnemyException("Trying to attack dead enemy");
        }
        System.out.println(getName() + " attacks " + enemy.getName());
        enemy.takeMagicDamage(state.getMagicDamage());
        state.healthUp(state.takeDamage(state.getMagicDamage() / 2));
        enemy.counterAttack(this);
    }

    @Override
    public void counterAttack(Unit attacker) throws DeadUnitException, DeadEnemyException {
        if (this.state.getHealthPoints() == 0) {
            throw new DeadUnitException("Attacker is dead");
        }
        if (attacker.state.getHealthPoints() == 0) {
            throw new DeadEnemyException("Trying to attack dead enemy");
        }
        System.out.println(getName() + " counterAttacks " + attacker.getName());
        attacker.takeMagicDamage(state.getMagicDamage() / 2);
        state.healthUp(state.takeDamage(state.getMagicDamage() / 2));
    }

}
