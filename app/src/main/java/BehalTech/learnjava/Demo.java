package BehalTech.learnjava;

public class Demo {
    public static void main(String[] args) {
        Player tim = new Player("tom smith" , 8);
        System.out.println(tim.getHandleName());
        System.out.println("level " + tim.getLevel());
        System.out.println("lives " + tim.getLives());
        //System.out.println(tim.getWeapon().getName()); //down there just wrote the code another
        //way its one and the same thing.
        Weapon timsweapon = tim.getWeapon();
        System.out.println(timsweapon.getName());


    }
    }

