package BehalTech.learnjava;


public class Demo {
    public static void main(String[] args) {
        for(int i=0; i<10; i++){
            VampyreKing vlad1 = new VampyreKing("vlad1 ");
            vlad1.showInfo();
            vlad1.takeDamage(12);
            vlad1.showInfo();
            while(vlad1.getLives() > 0){
                if (vlad1.dodges()) {
                    continue;
                }
                if(vlad1.ranAway()){
                    System.out.println("vlad1 ran away...");

                    break;
                }else {
                    vlad1.takeDamage(80);
                    vlad1.showInfo();
                }
            }
            System.out.println("==========================================================");
        }
//       Enemy enemy = new Enemy("test enemy " , 10 , 3);
//        enemy.showInfo();
//        enemy.takeDamage(3);
//        enemy.showInfo();
//        enemy.takeDamage(11);
//        enemy.showInfo();
//        Troll uglyTroll = new Troll("uglyTroll");
//        uglyTroll.showInfo();
//        uglyTroll.takeDamage(30);
//
//        Vampyre vlad = new Vampyre("vlad");
//        vlad.showInfo();
//        vlad.takeDamage(8);
//        vlad.showInfo();


//        Player conan = new Player("Conan");
//        conan.pickupLoot(new Loot("Invisibility", LootType.POTION, 4));
//        conan.pickupLoot(new Loot("Mithril", LootType.ARMOR, 183));
//        conan.pickupLoot(new Loot("Ring of speed", LootType.RING, 25));
//        conan.pickupLoot(new Loot("Red Potion", LootType.POTION, 2));
//        //conan.pickupLoot(new Loot("Cursed Shield", LootType.ARMOR, -8));
//        conan.pickupLoot(new Loot("Brass Ring", LootType.RING, 1));
//        conan.pickupLoot(new Loot("Chain Mail", LootType.ARMOR, 4));
//        conan.pickupLoot(new Loot("Gold Ring", LootType.RING, 12));
//        conan.pickupLoot(new Loot("Health Potion", LootType.POTION, 3));
//        conan.pickupLoot(new Loot("Silver Ring", LootType.RING, 6));
//        conan.showInventory();
//
//        System.out.println(conan.score());

    }

}

