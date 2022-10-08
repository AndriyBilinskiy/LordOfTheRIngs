import lotr.Character;
public class GameManager {
    public static void fight(Character c1, Character c2){
        String c1Name = c1.getClass().getSimpleName();
        String c2Name = c2.getClass().getSimpleName();
        System.out.println(c1Name + " ( " + Integer.toString(c1.getHp())+ " HP " + Integer.toString(c1.getPower())
                + " POWER )"+ " fights " + c2Name+ " ( " + Integer.toString(c2.getHp())+ " HP "
                + Integer.toString(c2.getPower())
                + " POWER )");
        int i = 0;
        while (true) {
            System.out.println(c1Name + "s move");
            c1.kick(c2);
            if (!c2.isAlive()){
                System.out.println(c1Name + " wins!");
                break;
            }else {
                System.out.println(c2Name + " has " + Integer.toString(c2.getHp()) + " HP left");
            }
            System.out.println(c2Name + "s move");
            c2.kick(c1);
            if (!c1.isAlive()){
                System.out.println(c1Name + " wins!");
                break;
            } else {
                System.out.println(c1Name + "has" + Integer.toString(c1.getHp()) + "HP left");
            }
            if (i >= 10){
                System.out.println("Draw!");
                break;
            }
            i++;

        }
    }
}
