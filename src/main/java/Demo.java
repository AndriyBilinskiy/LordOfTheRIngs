public class Demo {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        CharacterFactory factory = new CharacterFactory();
        GameManager manager = new GameManager();
        GameManager.fight(factory.createCharacter(),factory.createCharacter());
    }
}
