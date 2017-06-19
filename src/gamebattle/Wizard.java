package gamebattle;

public class Wizard extends Unit {

    Wizard() {
        this.name = "Wizard";
        this.hp = 50;
        Damage dmg = new MagicDamage(200);
    }

}
