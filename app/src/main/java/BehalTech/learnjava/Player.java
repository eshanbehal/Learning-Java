package BehalTech.learnjava;

public class Player {
    private  String handleName;
    private int lives;
    private int level;
    private int score;

public Player() {
    handleName = "Unknown Player";
    lives = 3;
    level = 1;
    score = 0;
}
public String getHandleName(){
    return handleName;
}
public void setHandleName(String handle){
    if(handle.length()<3 ){
        return;
    }
    handleName = handle;
}
}

