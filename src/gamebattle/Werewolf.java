package gamebattle;

public class Werewolf extends Unit {
    State otherState = new WolfState();

    Werewolf() {
        super("Werewolf-human", 80, 80, 10, 0);
    }

    public void changeState() {
        State temp = state;

        if (state.getMaxHealthPoints() == 80) {
            otherState.healthUp(state.getHealthPoints());
        } else {
            otherState.takeDamage(state.getHealthPoints() / 2);
        }

        state = otherState;
        otherState = temp;
        System.out.println("Werewolf changed state");
    }

}
