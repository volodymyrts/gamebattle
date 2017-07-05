package gamebattle;

public class Werewolf extends Unit {
    State otherState = new State("Werewolf-wolf", 160, 160, 16, 0);

    Werewolf() {
        super("Werewolf-human", 80, 80, 10, 0);
    }

    public void changeState() {
        State temp = state;
        otherState.healthPoints = state.getHealthPoints() * otherState.getMaxHealthPoints() / state.getMaxHealthPoints();
        state = otherState;
        otherState = temp;
        System.out.println("Werewolf changed state");
    }

    @Override
    public int takeMagicDamage(int magicDamage) throws DeadUnitException {
        if (state.getMaxHealthPoints() == 80) {
            return state.takeDamage(magicDamage);
        } else {
            return state.takeDamage(magicDamage * 2);
        }
    }

}
