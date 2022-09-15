import java.util.HashMap;
import java.util.Map;

public class Main {

    private final static String TEXT = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static char maxChar;

    public static char minChar;

    public static void main(String[] args) {
        Map<Character, Integer> charQuantity = new HashMap<>();


        for (int i = 0; i < TEXT.length(); i++) {
            Character currentChar = TEXT.charAt(i);
            if (!Character.isLetter(currentChar)) {
                continue;
            }
            if (!charQuantity.containsKey(currentChar)) {
                charQuantity.put(currentChar, 1);
            } else {
                charQuantity.put(currentChar, charQuantity.get(currentChar) + 1);
            }
        }

        int maxValue = -1;
        for (char value : charQuantity.keySet()) {
            if (charQuantity.get(value) > maxValue) {
                maxValue = charQuantity.get(value);
                maxChar = value;
            }
        }
        int minValue = Integer.MAX_VALUE;
        for (char value : charQuantity.keySet()) {
            if (charQuantity.get(value) < minValue) {
                minValue = charQuantity.get(value);
                minChar = value;
            }
        }

        System.out.println("Больше всего в тексте повторяется символ: " + maxChar + ". Его можно встретить " + maxValue + " раз");
        System.out.println("Меньше всего в тексте повторяется символ: " + minChar + ". Его можно встретить " + minValue + " раз");

    }
}
