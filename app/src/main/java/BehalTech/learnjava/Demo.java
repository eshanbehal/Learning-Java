package BehalTech.learnjava;

public class Demo {
    public static void main(String[] args) {
        Player tim = new Player();
        System.out.println(tim.getHandleName());
        tim.setHandleName("tim");
        System.out.println(tim.getHandleName());
    }
    }

