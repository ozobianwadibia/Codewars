// Write a function that takes an array of numbers (integers for the tests) and a target number. It should find two different items in the array that, when added together, give the target value. The indices of these items should then be returned in a tuple / list (depending on your language) like so: (index1, index2).
//
// For the purposes of this kata, some tests may have multiple answers; any valid solutions will be accepted.
//
// The input will always be valid (numbers will be an array of length 2 or greater, and all of the items will be numbers; target will always be the sum of two different items from that array).


import java.util.ArrayList;

public class TwoSum {
    public static int[] twoSum(int[] numbers, int target) {
        // arraylist to hold the indices of the numbers that match
        ArrayList<Integer> holdIndices = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < numbers.length; j++) {
                if ((numbers[i] + numbers[j] == target) && (i != j)) {
                    holdIndices.add(i);
                    holdIndices.add(j);
                }
            }
        }
        // ArrayList to Array Conversion
        int[] newArray = holdIndices.stream().mapToInt(i -> i).toArray();
        return new int[]{newArray[0], newArray[1]}; // the first two that match
    }
}