package BehalTech.learnjava;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        Player tim = new Player("tom smith" , 8);
        //System.out.println(tim.getHandleName());
       // System.out.println("level " + tim.getLevel());
       // System.out.println("lives " + tim.getLives());
        //System.out.println(tim.getWeapon().getName()); //down there just wrote the code another
        //way its one and the same thing.
        //Weapon timsweapon = tim.getWeapon();
         //System.out.println(tim.getWeapon().getName());

         Weapon myAxe = new Weapon("GoldshineAxe" , 12 , 20);
         tim.setWeapon(myAxe);
       // System.out.println(tim.getWeapon().getName());

        Loot redPotion = new Loot("RED POTION", LootType.POTION , 7);
        tim.pickupLoot(redPotion);

        tim.pickupLoot(new Loot("+3 CHEST ARMOR" , LootType.ARMOR , 80));

        tim.showInventory();


     //   Loot bluePotion =new Loot("BLUE POTION", LootType.POTION , 8);
        boolean wasDeleted = tim.dropLoot(redPotion);
        System.out.println(wasDeleted);
        tim.showInventory();

    }
    }

