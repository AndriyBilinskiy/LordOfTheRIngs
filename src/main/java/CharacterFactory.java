import lotr.Character;
import lotr.Elf;
import org.reflections.Reflections;

import java.util.Random;
import java.util.Set;

public class CharacterFactory {
    Character createCharacter() throws InstantiationException, IllegalAccessException {
        Reflections reflections = new Reflections("lotr");
        Set<Class<? extends Character>> subTypes = reflections.getSubTypesOf(Character.class);
        Random random = new Random();
        Class<?> cls = (Class<?>) subTypes.toArray()[random.nextInt(subTypes.size())];
        return (Character) cls.newInstance();
    }
}
