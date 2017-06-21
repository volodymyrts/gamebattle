package gamebattle;

public class GameBattle {

    public static void main(String[] args) {

        Unit soldier = new Soldier();
        Unit rogue = new Rogue();
        //Unit berserker = new Berserker();
        //Unit werevolf = new Werevolf(new StateHuman());

        System.out.println(soldier);
        System.out.println(rogue);
        //System.out.println(werevolf);
        
        System.out.println();
        System.out.println("--- BATTLE BEGINS ---");
        
        
        soldier.attack(rogue);
        System.out.println();
        rogue.attack(soldier);
        System.out.println();
        soldier.attack(rogue);
        System.out.println();
        rogue.attack(soldier);

//        werevolf.attack(soldier);
//        System.out.println();
//        werevolf.
//        werevolf.attack(rogue);
//        System.out.println();

//        berserker.attack(rogue);
//        System.out.println();
//        berserker.attack(soldier);
//        System.out.println();

        System.out.println("--- END OF BATTLE ---");
        System.out.println();

        System.out.println(soldier);
        System.out.println(rogue);

    }
    
}
