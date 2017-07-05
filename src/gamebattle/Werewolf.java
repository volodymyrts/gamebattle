package gamebattle;

public class Werewolf extends Unit {
    State otherState = new WolfState();

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

}
