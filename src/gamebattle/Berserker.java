package gamebattle;

public class Berserker extends Unit {
    
    Berserker() {
        super("Berserker", 110, 110, 16, 0);
    }

    @Override
    public void takeMagicDamage(int damage) {
        System.out.println("I have immunitet to magic damage!");
    }

}
