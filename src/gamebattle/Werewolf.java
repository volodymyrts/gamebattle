package gamebattle;

public class Werewolf extends Unit {
    State otherState = new WolfState();

    Werewolf() {
        super("Werewolf-human", 80, 80, 10, 0);
    }

    public void changeState() {
        State temp = state;
        state = otherState;

        if (temp.getMaxHealthPoints() == 80) {
            state.takeDamage(state.getHealthPoints());
            state.healthUp(temp.getHealthPoints() * 2);
        } else {
            state.takeDamage(state.getHealthPoints());
            state.healthUp(temp.getHealthPoints() / 2);
        }

        otherState = temp;
        System.out.println("Werewolf changed state");
    }

}
