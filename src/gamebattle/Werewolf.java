package gamebattle;

public class Werewolf extends Unit {

    State alterState;

    Werewolf() {
        super("Werewolf-human", 80, 80, 10, 0);
        alterState = new State("Werewolf-wolf", 160, 160, 16, 0);
    }

    @Override
    public void werewolfChangeState() {
        State temp = state;
        if (state.getMaxHealthPoints() == 80) {
            alterState.healthUp(state.getHealthPoints() * alterState.getMaxHealthPoints() / state.getMaxHealthPoints());
        } else {
            alterState.healthUp(-state.getHealthPoints() * alterState.getMaxHealthPoints() / state.getMaxHealthPoints());
        }
        state = alterState;
        alterState = temp;
        System.out.println("Werewolf changed state");
    }

}
