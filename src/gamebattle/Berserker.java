package gamebattle;

public class Berserker extends Unit {
    
    Berserker() {
        super(110, 16, 0);
        this.name = "Berserker";
    }

    @Override
    public void takeMagicDamage(int damage) {
        System.out.println("I have immunitet from magic damage!");
    }

}
