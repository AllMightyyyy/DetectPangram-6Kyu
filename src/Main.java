import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*
        A pangram is a sentence that contains every single letter of the alphabet at least once.
        For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram,
        because it uses the letters A-Z at least once (case is irrelevant).

        Given a string, detect whether or not it is a pangram. Return True if it is, False if not.
        Ignore numbers and punctuation.
         */

    }
    public boolean isPangram(String str) {
        str = str.toLowerCase().replaceAll(" ", "");
        for(char letter = 'a'; letter <= 'z'; letter++) {
            if(str.indexOf(letter) == -1) return false;
        }
        return true;
    }
}