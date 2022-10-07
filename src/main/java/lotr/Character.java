package lotr;
import lombok.Getter;
import lombok.Setter;
@Getter @Setter
public abstract class Character {
    private int hp;

    private int power;
    boolean isAlive(){
        return getHp() > 0;
    }
    Character(int hp, int power){
        this.hp = hp;
        this.power = power;
    }



    public abstract void kick(Character c);
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "hp=" + hp +
                ", power=" + power +
                '}';
    }

    public void setHp(int hp) {
        this.hp = Math.max(hp, 0);
    }
}
