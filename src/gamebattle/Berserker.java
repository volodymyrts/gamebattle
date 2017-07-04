package gamebattle;

public class Berserker extends Unit {
    
    Berserker() {
        super("Berserker", 110, 110, 16, 0);
    }

    @Override
    public int takeMagicDamage(int magicDamage) {
        System.out.println("I have immunitet to magic damage!");
        return 0;
    }

}
