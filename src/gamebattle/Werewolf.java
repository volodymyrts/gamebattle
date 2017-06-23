package gamebattle;

public class Werewolf extends Unit {

    Boolean human;

    Werewolf() {
        super(80, 10, 0);
        name = "Werewolf";
        human = true;
    }

    @Override
    public void transform() {
        if (human == true) {
            human = false;
            state.setHealthPoints(state.getHealthPoints()*2);
            state.setDamage(16);
        } else {
            human = true;
            state.setHealthPoints(state.getHealthPoints()/2);
            state.setDamage(10);
        }
        System.out.println("tranformed");
    }

    @Override
    public void takeMagicDamage(int magicDamage) {
        super.takeMagicDamage(magicDamage*2);
    }

}
