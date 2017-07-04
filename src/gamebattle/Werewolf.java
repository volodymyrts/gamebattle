package gamebattle;

public class Werewolf extends Unit {

    State wolfState;

    Werewolf() {
        super("Werewolf-human", 80, 80, 10, 0);
        wolfState = new StateWolf("Werewolf-wolf", 160, 160, 16, 0);
    }

    @Override
    public void werewolfChangeState() {
        State temp = state;
        wolfState.setHealthPoints(state.getHealthPoints() * wolfState.getMaxHealthPoints() / state.getMaxHealthPoints());
        state = wolfState;
        wolfState = temp;
        System.out.println("Werewolf changed state");
    }

//  in alterState (Werewolf state) takes double damage from magic
    @Override
    public void takeMagicDamage(int magicDamage) throws DeadUnitException {
        if (state.getMaxHealthPoints() == 160) {
            state.takeDamage(magicDamage*2);
        }
    }

}
