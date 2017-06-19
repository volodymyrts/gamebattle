package gamebattle;

import java.lang.Override;
import java.lang.String;

public class Damage {

    int dmg;
    //String type;

    Damage(int dmg) {
        this.dmg = dmg;

    };

    @Override
    public String toString() {
        return "Damage [" + dmg + "]";
    }
}