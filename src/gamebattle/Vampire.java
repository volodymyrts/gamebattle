package gamebattle;

public class Vampire extends Unit {

    Vampire() {
        super(110, 0, 12);
        name = "Vampire";
    }

//    @Override
//    public void attack(Unit enemy) throws MyException {
//        if (!this.isDead() && !enemy.isDead()) {
//            System.out.println(getName() + " attacks " + enemy.getName());
//            int healthPointsBeforeAttack = enemy.state.healthPoints;
//            enemy.takeDamage(this.state.damage);
//            enemy.takeMagicDamage(this.state.magicDamage);
//            if (this.state.damage > healthPointsBeforeAttack) {
//                healthUpHalfDamageFromAttack(healthPointsBeforeAttack/2);
//            } else {
//                healthUpHalfDamageFromAttack(state.damage / 2);
//            }
//            if (this.state.magicDamage > healthPointsBeforeAttack) {
//                healthUpHalfDamageFromAttack(healthPointsBeforeAttack / 2);
//            } else {
//                healthUpHalfDamageFromAttack(state.magicDamage / 2);
//            }
//            enemy.counterAttack(this);
//        } else {
//            try {
//                throw new MyException("trying to attack dead enemy");
//            }
//            catch (MyException e) {
//                System.out.println("Message: " + e.getMessage());
//            }
//            //System.out.println(getName() + " attacks dead " + enemy.getName());
//        }
//    }

//    @Override
//    public void counterAttack(Unit attacker) {
//        if (!this.isDead() && !attacker.isDead()) {
//            System.out.println(getName() + " counterAttacks " + attacker.getName());
//            attacker.takeDamage(state.magicDamage/2);
//            if (state.damage/2 > healthPointsBeforeAttack) {
//                healthUpHalfDamageFromAttack(healthPointsBeforeAttack/2);
//            } else {
//                healthUpHalfDamageFromAttack(state.damage/2);
//            }
//            if (this.state.magicDamage/2 > healthPointsBeforeAttack) {
//                healthUpHalfDamageFromAttack(healthPointsBeforeAttack/2);
//            } else {
//                healthUpHalfDamageFromAttack(state.magicDamage/2);
//            }
//        } else {
//            try {
//                throw new MyException("attacker is dead or trying to counterAttack dead enemy");
//            }
//            catch (MyException e) {
//                System.out.println("Message: " + e.getMessage());
//            }
//            //System.out.println(getName() + " is dead and can't counterAttack");
//        }
//    }

//    @Override
//    public void healthUpHalfDamageFromAttack(int healthPoints) {
//        System.out.println("healthUpHalfDamageFromAttack(" + healthPoints + ")");
//        state.healthPoints += healthPoints;
//        if (state.healthPoints > maxHealthPoints) {
//            state.healthPoints = maxHealthPoints;
//        }
//    }

}
