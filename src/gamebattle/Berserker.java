package gamebattle;

public class Berserker extends Unit {
    
    Berserker() {
        this.name = "Berserker";
        this.hp = 110;
        Damage dmg = new PowerDamage(16);
        //this.dmg = 16;
    }
    
}
