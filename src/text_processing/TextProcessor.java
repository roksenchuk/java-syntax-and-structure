package text_processing;

public class TextProcessor {

    public static void main(String[] args) {
        countWords("I love Java");
    }

    /**
     * Splits a String into an array by tokenizing it
     * Counts words and prints them
     * @param text Full string to be split
     */
    public static void countWords(String text) {

        String[] words = text.split(" ");
        int numberOfWords = words.length;
        String message = String.format("Your String contains %d words", numberOfWords);
        System.out.println(message);

        for (int i = 0; i < numberOfWords; i++) {
            String word = words[i];
            System.out.println(word);
        }
    }

    /**
     * Prints String in the reverse order
     * @param text Full string to be reversed
     */
    public static void reverseString(String text) {

    }
}
