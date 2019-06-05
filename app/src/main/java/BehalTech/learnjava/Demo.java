package BehalTech.learnjava;

public class Demo {
    public static void main(String[] args) {
        Player tim = new Player();
        System.out.println(tim.getHandleName());
        tim.setHandleName("tim");
        System.out.println(tim.getHandleName());
        System.out.println("level " + tim.getLevel());
        System.out.println("lives " + tim.getLives());

        Player louise = new Player("louise");
        System.out.println(louise.getHandleName());
        louise.setLives(5);
        System.out.println("level " + louise.getLevel());
        System.out.println("lives " + louise.getLives());



        Player gr8 = new Player("gr8" , 9);
        System.out.println(gr8.getHandleName());
        System.out.println("level " + gr8.getLevel());
        System.out.println("lives " + gr8.getLives());
    }
    }

