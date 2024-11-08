package loops;

import java.util.Scanner;

/*
 * BREAK STATEMENT
 * Search a String to determine if it contains the letter 'A'
 */
public class LetterSearch {

    public static void main(String[] args) {
        // Get text
        System.out.println("Enter some text: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        scanner.close();

        boolean letterFound = false;

        // Search text for letter A
        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            if (letter == 'A' || letter == 'a') {
                letterFound = true;
                break;
            }
        }

        if (letterFound) {
            System.out.println("No such letter");
        } else {
            System.out.println("Found letter");
        }
    }
}
