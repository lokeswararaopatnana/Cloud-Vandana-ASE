import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PangramChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        scanner.close();

        if (isPangram(input)) {
            System.out.println("It's a pangram!");
        } else {
            System.out.println("It's not a pangram.");
        }
    }

    public static boolean isPangram(String input) {
        // Convert the input to lowercase for case-insensitive comparison
        input = input.toLowerCase();

        // Create a set to store the unique letters in the input
        Set<Character> uniqueLetters = new HashSet<>();

        // Iterate through the characters in the input
        for (char c : input.toCharArray()) {
            // Check if the character is an alphabet letter and not already in the set
            if (Character.isAlphabetic(c) && !uniqueLetters.contains(c)) {
                uniqueLetters.add(c);
            }
        }

        // Check if there are 26 unique letters (A to Z)
        return uniqueLetters.size() == 26;
    }
}
