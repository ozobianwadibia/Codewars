// Given a string of words, you need to find the highest scoring word.
// Each letter of a word scores points according to its position in the alphabet: a = 1, b = 2, c = 3 etc.
// For example, the score of abad is 8 (1 + 2 + 1 + 4).
// You need to return the highest scoring word as a string.
// If two words score the same, return the word that appears earliest in the original string.
// All letters will be lowercase and all inputs will be valid.


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HighestScoringWord {

    /**
     * Method to compute alphabetical value of words
     * @param word the given word
     * @return the sum of letter values
     */
    public static int sumOfNumValues(String word) {
        int numValue = 0;
        for (int i = 0; i < word.length(); i++) {
            int charValue = (int) (word.charAt(i));
            numValue += charValue - 96;
        }
        return numValue;
    }

    /**
     * Method to compute the highest scoring word in a string
     * @param s the given string
     * @return the highest scoring word
     */
    public static String high(String s) {
        // string array for the string input
        String[] words = s.split(" ");
        // Hash map to contain the strings and numerical values
        HashMap<String, Integer> tally = new LinkedHashMap<>();
        for (int i = 0; i < words.length; i++) {
            tally.put(words[i], sumOfNumValues(words[i]));
        }
        int maxValue = Integer.MIN_VALUE;
        String maxKey = null;
        // iterating through the hashmap
        for (Map.Entry<String, Integer> entry: tally.entrySet()) {
          if (entry.getValue() > maxValue) {
              maxValue = entry.getValue();
              maxKey = entry.getKey();
          }
        }
         return maxKey;
    }

    public static void main(String[] args) throws Exception {
        String test = "xaa z ya"; // xaa
        System.out.println(high(test));
    }
}
