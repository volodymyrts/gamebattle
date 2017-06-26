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
            state.healthPoints = state.healthPoints*2;
            state.damage = 16;
        } else {
            human = true;
            state.healthPoints = state.healthPoints/2;
            state.damage = 10;
        }
        System.out.println("tranformed");
    }

    @Override
    public void takeMagicDamage(int magicDamage) {
        if (!human) {
            super.takeMagicDamage(magicDamage*2);
        } else {
            super.takeMagicDamage(magicDamage);
        }
    }

}
