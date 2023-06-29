//Description:
//
//        Your task is to sort a given string. Each word in the string will contain a single number. This number is the position the word should have in the result.
//
//        Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
//
//        If the input string is empty, return an empty string. The words in the input String will only contain valid consecutive numbers.
//        Examples
//
//        "is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"
//        "4of Fo1r pe6ople g3ood th5e the2"  -->  "Fo1r the2 g3ood 4of th5e pe6ople"
//        ""  -->  ""


import java.util.ArrayList;
import java.util.Collections;

public class Order {

    public static String digitExtractor(String word) {
        int digitValue = 0;
        for (int i = 0; i < word.length(); i++) {
            char character = word.charAt(i);
            if (Character.isDigit(character)) {
                digitValue += Character.digit(character, 10);
                break;
            }
        }
        return String.valueOf(digitValue);
    }
    public static String order(String words) {

        if (words.trim().isEmpty()) {
            return "";
        }
        // split the string into string array
        String[]newWords = words.split(" ");
        // arraylist for the modified words
        ArrayList<String> modifiedWords = new ArrayList<>();
        for (String newWord : newWords) {
            modifiedWords.add(digitExtractor(newWord) + newWord);
        }
        // sorting the words
        Collections.sort(modifiedWords);
        // arraylist to hold new modified words
        ArrayList<String> newModifiedWords = new ArrayList<>();
        for (String string : modifiedWords) {
            newModifiedWords.add(string.substring(1));
        }
        return String.join(" ", newModifiedWords);
    }
}