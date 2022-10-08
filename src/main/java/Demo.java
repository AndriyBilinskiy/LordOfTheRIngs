public class Demo {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        CharacterFactory factory = new CharacterFactory();
        System.out.println(factory.createCharacter());
    }
}
