package gamebattle;

public class AlterState extends State {

    AlterState(String name, int healthPoints, int maxHealthPoints, int physicalDamage, int magicDamage){
        super("Werewolf-wolf", 160, 160, 16, 0);
    }

    public void takeMagicDamage(int magicDamage) throws DeadUnitException {
        takeDamage(magicDamage * 2);
    }

    @Override
    public void update(State state) {
        this.healthPoints = state.getHealthPoints() / 2;
    }

}
