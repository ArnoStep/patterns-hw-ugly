public class InputProcessor {

    private static InputProcessor instance = new InputProcessor();

    public static InputProcessor getInstance() {
        if (instance == null) {
            instance = new InputProcessor();
        }
        return instance;
    }

    public final String processInput(final String input) {
        String result;

        if (input.trim().matches("\\d{4}")) {
            // Создаём Person
            result = PersonFactory.getPersonWithInputId(input).toString();
        } else {
            return "Неверный ввод.";
        }
        return result;
    }
}