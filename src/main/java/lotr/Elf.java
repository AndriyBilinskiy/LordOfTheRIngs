package lotr;

public class Elf extends Character{
    public Elf(){super(10, 10);}
    @Override
    public void kick(Character c){
//        kill everybody weaker than him, otherwise decrease the power of character by 1
        if (c.getPower() < this.getPower()){
            c.setHp(0);
        }else {
            c.setPower(c.getPower() - 1);
        }
    }
}
