//You are given an array(list) strarr of strings and an integer k. Your task is to return the first longest string consisting of k consecutive strings taken in the array.
//        Examples:
//
//        strarr = ["tree", "foling", "trashy", "blue", "abcdef", "uvwxyz"], k = 2
//
//        Concatenate the consecutive strings of strarr by 2, we get:
//
//        treefoling   (length 10)  concatenation of strarr[0] and strarr[1]
//        folingtrashy ("      12)  concatenation of strarr[1] and strarr[2]
//        trashyblue   ("      10)  concatenation of strarr[2] and strarr[3]
//        blueabcdef   ("      10)  concatenation of strarr[3] and strarr[4]
//        abcdefuvwxyz ("      12)  concatenation of strarr[4] and strarr[5]
//
//        Two strings are the longest: "folingtrashy" and "abcdefuvwxyz".
//        The first that came is "folingtrashy" so
//        longest_consec(strarr, 2) should return "folingtrashy".
//
//        In the same way:
//        longest_consec(["zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"], 2) --> "abigailtheta"


import java.util.ArrayList;
import java.util.Collections;


public class LongestConsec {

    /**
     * Method to compute the longest consecutive string
     * @param strarr the given string array
     * @param k the integer, k
     * @return the longest string
     */
    public static String longestConsec(String[] strarr, int k) {
        // Check if the number of words to concatenate is valid.
        if (k >= strarr.length || k <= 0) {
            return "";
        }

        // arraylist to hold contents of string array
        ArrayList<String> newWords = new ArrayList<>();
        Collections.addAll(newWords, strarr);

        // arraylist to separate elements of newWords according to k
        ArrayList<String> tempArray = new ArrayList<>();

        // Iterate through the first k strings in the array
        while (k <= newWords.size()) {
            for (int i = 0; i < k; i++) {
                tempArray.add(newWords.get(i));
            }
            newWords.remove(0);
        }
        // arraylist to hold final modification of tempArray contents
        ArrayList<String> newList = new ArrayList<>();

        for (int i = 0; i < tempArray.size(); i += k) {
            StringBuilder concatString = new StringBuilder();
            for (int j = i; j < Math.min(i + k, tempArray.size()); j++) {
                concatString.append(tempArray.get(j));
            }
            newList.add(concatString.toString());
        }

        int maxLength = 0; // the max length of the string in newList
        String longestString = "";
        for (String str : newList) {
            if (str.length() > maxLength) {
                maxLength = str.length();
                longestString = str;
            }
        }
        return longestString;
    }
}
