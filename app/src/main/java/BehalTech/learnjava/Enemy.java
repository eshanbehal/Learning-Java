package BehalTech.learnjava;

public class Enemy {
    private String name;
    private int hitPoints;
    private int lives;

    public Enemy(String name, int hitPoints, int lives) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.lives = lives;
    }
    public  void takeDamage(int damage){
        int remainingHitPoints = this.hitPoints - damage;
        if(remainingHitPoints > 0){
            setHitPoints(remainingHitPoints);
            System.out.println("I Took " + damage +" points damage and i have "+ remainingHitPoints + " left.");
        }else{
            this.lives = this.lives - 1;
            if(lives > 0){
                System.out.println("I Have lost a life,"  + this.lives + " lives left");
            }else {
                System.out.println("No lives left , i am dead.");
            }

        }
    }

    public void showInfo(){
        System.out.println("Names :" + this.name + "hitPoints :" + this.hitPoints + " Lives :" +  this.lives );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }
}
