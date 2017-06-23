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
        if (human) {
            human = false;
            state.setHealthPoints(state.getHealthPoints()*2);
            state.setPhysicalDamage(16);
        } else {
            human = true;
            state.setHealthPoints(state.getHealthPoints()/2);
            state.setPhysicalDamage(10);
        }
        System.out.println("tranformed");
    }

    @Override
    public void takeMagicDamage(int magicDamage) {
        super.takeMagicDamage(magicDamage*2);
    }

}
