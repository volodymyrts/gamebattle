package gamebattle;

public class Werewolf extends Unit {

    Boolean human;

    Werewolf() {
        super(80, 10, 0);
        this.name = "Werewolf";
        this.human = true;
    }

    @Override
    public void transform() {
        if (human == true) {
            human = false;
            state.healthPoints *= 2;
            state.damage *= 2;
            state.powerDamage *= 2;
        } else {
            human = true;
            state.healthPoints /= 2;
            state.damage /= 2;
            state.powerDamage /= 2;
        }
        System.out.println("tranformed");
    }

}
