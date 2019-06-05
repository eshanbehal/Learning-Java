package BehalTech.learnjava;

public class HelloWorld {
    public static void main(String[] args) {
        int lives = 3;
        boolean isGameOver = (lives<1);
        System.out.println(isGameOver);

        if (isGameOver){
            System.out.println("GameOver");
        }
        else{
            System.out.println("You're Alive Here!!! ");
        }
    }
}
