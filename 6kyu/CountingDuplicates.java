//Count the number of Duplicates
//
//        Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric digits that occur more than once in the input string. The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.
//        Example
//
//        "abcde" -> 0 # no characters repeats more than once
//        "aabbcde" -> 2 # 'a' and 'b'
//        "aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
//        "indivisibility" -> 1 # 'i' occurs six times
//        "Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
//        "aA11" -> 2 # 'a' and '1'
//        "ABBA" -> 2 # 'A' and 'B' each occur twice

import java.util.ArrayList;
import java.util.HashMap;


public class CountingDuplicates {

    /**
     * Method to count character occurrences
     * @param str the given string
     * @param ch the given char
     * @return the count
     */
    public static long countOneChar(String str, char ch) {
        long count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i)) {
                count++;
            }
        }
        return count;
    }

    /**
     * Method to count duplicate chars
     * @param text the given string
     * @return the number of chars with duplicates.
     */
    public static int duplicateCount(String text) {
        text = text.toLowerCase(); // changing text to lowercase
        // hashmap to store characters and their occurrences
        HashMap<Character, Long> countChars = new HashMap<>();
        // populating the hashmap
        for (int i = 0; i < text.length(); i++) {
            countChars.put(text.charAt(i), countOneChar(text, text.charAt(i)));
        }

        // arraylist for unique elements: occurrences >= 2
        ArrayList<Character> countUs = new ArrayList<>();
        //---------------------------------------------------------------//
        for (HashMap.Entry<Character, Long> entry : countChars.entrySet()) {
            if (entry.getValue() >= 2) {
                countUs.add(entry.getKey());
            }
        }
        return countUs.size(); // return arraylist size / count
    }
}
