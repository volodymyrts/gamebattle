package gamebattle;

public class GameBattle {

    public static void main(String[] args) {

        Unit soldier = new Soldier();
        Unit rogue = new Rogue();
        Unit berserker = new Berserker();

        System.out.println(soldier);
        System.out.println(rogue);
        System.out.println(berserker);
        
        System.out.println();
        System.out.println("--- BATTLE BEGINS ---");
        
        
        soldier.attack(rogue);
        System.out.println();
        rogue.attack(soldier);
        System.out.println();
        soldier.attack(rogue);
        System.out.println();
        rogue.attack(soldier);
        
        soldier.attack(berserker);
        System.out.println();
        rogue.attack(berserker);
        System.out.println();
        
        berserker.attack(rogue);
        System.out.println();
        berserker.attack(soldier);
        System.out.println();
        
        System.out.println("--- END OF BATTLE ---");
        System.out.println();
        
        System.out.println(soldier);
        System.out.println(rogue);

    }
    
}
