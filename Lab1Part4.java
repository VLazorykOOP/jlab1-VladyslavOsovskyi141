import java.util.*;

public class Lab1Part4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text:");
        String text = sc.nextLine();

        String result = removeWordsWithRepeatedLetters(text);

        System.out.println("Result:");
        System.out.println(result);

        sc.close();
    }

    static String removeWordsWithRepeatedLetters(String text) {
        String[] words = text.split("[\\s,.!?;:()\"']+");

        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            if (word.isEmpty()) continue;

            if (!hasRepeatingLetters(word)) {
                sb.append(word).append(" ");
            }
        }

        return sb.toString().trim();
    }

    static boolean hasRepeatingLetters(String word) {
        Set<Character> seen = new HashSet<>();

        for (char c : word.toCharArray()) {
            c = Character.toLowerCase(c);
            if (seen.contains(c)) {
                return true;
            }
            seen.add(c);
        }

        return false;
    }
}
