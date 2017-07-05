package gamebattle;

public class WolfState extends State {

    WolfState(){
        super("Werewolf-wolf", 160, 160, 16, 0);
    }

    @Override
    public int takeMagicDamage(int magicDamage) {
        return takeDamage(magicDamage * 2);
    }

}
