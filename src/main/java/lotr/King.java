package lotr;
import java.util.Random;

public class King extends Character{
    public King(){
        super(new Random().nextInt(10) + 5,new Random().nextInt(10) + 5);
    }

    public King(int hp, int power) {
        super(hp, power);
    }

    @Override
    public void kick(Character c) {
        c.setHp(c.getHp() - this.getPower());
    }
}
