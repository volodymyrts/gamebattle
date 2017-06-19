package gamebattle;

public class Soldier extends Unit {

    Soldier() {
        this.name = "Soldier";
        this.hp = 100;
        Damage dmg = new PowerDamage(10);
        //this.dmg = 10;
    }

}
