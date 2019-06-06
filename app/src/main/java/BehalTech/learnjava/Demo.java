package BehalTech.learnjava;

public class Demo {
    public static void main(String[] args) {
        Player tim = new Player();
        System.out.println(tim.getHandleName());
        tim.setNameAndLevel("ti" , 5);
        System.out.println(tim.getHandleName());
        System.out.println("level " + tim.getLevel());
        System.out.println("lives " + tim.getLives());


    }
    }

