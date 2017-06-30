package gamebattle;

public class Berserker extends Unit {
    
    Berserker() {
        super(110, 16, 0);
        name = "Berserker";
    }

    @Override
    public void takeDamage(int physicalDamage, int magicDamage) {
        int physicalDamage1 = state.takePhysicalDamage(physicalDamage);
        System.out.println(this.name + " takes " + physicalDamage1 + " damage (left " + state.healthPoints + " healthpoints)");
    }

}
