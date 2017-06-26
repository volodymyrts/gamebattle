package gamebattle;

public class GameBattle {

    public static void main(String[] args) {

        Unit soldier = new Soldier();
        Unit rogue = new Rogue();
        Unit berserker = new Berserker();
        Unit werewolf = new Werewolf();
        Unit vampire = new Vampire();

        System.out.println(soldier);
        System.out.println(rogue);
        System.out.println(berserker);
        System.out.println(werewolf);
        System.out.println(vampire);

        System.out.println();
        System.out.println("--- BATTLE BEGINS ---");
        
        
        soldier.attack(rogue);
        System.out.println();
        rogue.attack(soldier);
        System.out.println();
        soldier.attack(berserker);
        System.out.println();
        rogue.attack(berserker);
        System.out.println();
        werewolf.attack(soldier);
        System.out.println();

        System.out.println(werewolf);
        werewolf.transform();
        System.out.println(werewolf);

        System.out.println();
        werewolf.attack(berserker);
        System.out.println();

        berserker.attack(rogue);
        System.out.println();
        berserker.attack(soldier);
        System.out.println();

        vampire.attack(soldier);
        System.out.println();
        vampire.attack(soldier);
        System.out.println();
        vampire.attack(soldier);
        System.out.println();
        vampire.attack(soldier);
        System.out.println();
        vampire.attack(soldier);
        System.out.println();
        vampire.attack(soldier);
        System.out.println();
//        berserker.attack(vampire);
//        System.out.println();

        System.out.println("--- END OF BATTLE ---");
        System.out.println();

        System.out.println(soldier);
        System.out.println(rogue);
        System.out.println(berserker);
        System.out.println(werewolf);
        System.out.println(vampire);

    }
    
}
