package BehalTech.learnjava;

public class Player {
    private  String handleName;
    private int lives;
    private int level;
    private int score;
    private Weapon weapon; //here Weapon is a class and weapon is the object of the class.



public Player() {
    // here we can call this empty argument comstructor by using another keyword "this"
    // that behaves as a method call
    // handleName = "Unknown Player"; so changing this to.
    // here as duplicated code is present which is not a good thing so we del these
    // three from first constructor nut here in order to remem these i have made them a comment
    // lives = 3;
    // level = 1;
    // score = 0;
    this("Unknown Player");
}

public Player(String handle){
    //converted to comments as another constructor contains same code.
    // handleName = handle;
    //lives = 3;
    //level = 1;
    //score = 0;
    this(handle,1);// here it means the construcot will be passed onto new constructor
    //called everytime.
}
public Player(String handle , int startinglevel){
    //this.handleName = handle;
    //this.lives = 3;
    //this.level = startinglevel;
    //this.score = 0;
    setHandleName(handle);
    setLives(3);
    setLevel(startinglevel);
    setScore(0);
    setdeafaultweapon();
}
public String getHandleName(){
    return handleName;
}
public void setHandleName(String handle){
    if(handle.length()<3 ){
        System.out.println("The Name " +  handle + " is too short ,must be 3 characters long." );
        return;
    }
    this.handleName = handle;
}
private void setdeafaultweapon(){
    this.weapon = new Weapon("sword" , 10, 20);
}

public void setNameAndLevel(String name , int level){
    //this.handleName = name;
    //this.level = level;
    setHandleName(name);
    setLevel(level);
}


    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}

