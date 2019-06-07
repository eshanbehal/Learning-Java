package BehalTech.learnjava;


public class Demo {
    public static void main(String[] args) {
//       Enemy enemy = new Enemy("test enemy " , 10 , 3);
//        enemy.showInfo();
//        enemy.takeDamage(3);
//        enemy.showInfo();
//        enemy.takeDamage(11);
//        enemy.showInfo();
        Troll uglyTroll = new Troll("uglyTroll");
        uglyTroll.showInfo();
        uglyTroll.takeDamage(30);

        Vampyre vlad = new Vampyre("vlad");
        vlad.showInfo();
        vlad.takeDamage(8);
        vlad.showInfo();

        VampyreKing vlad1 = new VampyreKing("vlad1 ");
        vlad1.showInfo();
        vlad1.takeDamage(12);
        vlad1.showInfo();

    }

}

