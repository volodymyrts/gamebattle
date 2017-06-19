package gamebattle;

public class Vampire extends Unit {

    Vampire() {
        this.name = "Vampire";
        this.hp = 110;
        Damage dmg = new MagicDamage(12);
    }

}
