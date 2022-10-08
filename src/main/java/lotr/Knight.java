package lotr;
import lotr.King;
import lotr.Character;
import java.util.Random;

public class Knight extends King {
    public Knight(){super(new Random().nextInt(10) + 2,new Random().nextInt(10) + 2);}
}
