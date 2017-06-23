package gamebattle;

public class Berserker extends Unit {
    
    Berserker() {
        super(110, 16, 0);
        name = "Berserker";
    }

    @Override
    public void takeMagicDamage(int damage) {}

}
