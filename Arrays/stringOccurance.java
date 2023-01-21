
import java.util.*;
public class stringOccurance
{
    public static void main(String[] args) {
        countLetters("santhoshjackson");
    }
    static void countLetters(String input) {
        String[] letters = input.split("");
        Set<String> uniqueLetters = new HashSet<String>(Arrays.asList(letters));
        System.out.println("Occurrences of each letter in the input string");
        for (String uniqueLetter: uniqueLetters) {
            int count = 0;
            for (String letter: letters) {
                if (letter.equals(uniqueLetter)) {
                    count++;
                }
            }
            System.out.println(uniqueLetter + " = " + count);
        }
    }
}
