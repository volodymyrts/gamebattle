package gamebattle;

public class Werewolf extends Unit {

    State alterState = new State(160, 16, 0);

    Werewolf() {
        super(80, 10, 0);
        name = "Werewolf";
    }

    @Override
    public void transform() {
        State temp = state;
        state = alterState;
        alterState = temp;
        System.out.println("tranformed");
    }

//  in alterState (Werewolf state) takes double damage from magic
    @Override
    public void takeDamage(int physicalDamage, int magicDamage) {
        int physicalDamage1 = state.takePhysicalDamage(physicalDamage);
        int magicDamage1 = state.takeMagicDamage(magicDamage*2);
        int summDamage = physicalDamage1 + magicDamage1;
        System.out.println(this.name + " takes " + summDamage + " damage (left " + state.healthPoints + " healthpoints)");
    }

}
