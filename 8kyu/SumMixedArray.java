// Given an array of integers as strings and numbers, return the sum of the array values as if all were numbers.
// Return your answer as a number.

import java.util.ArrayList;
import java.util.List;

public class SumMixedArray {

    /*
     * Assume input will be only of Integer o String type
     */
    public int sum(List<?> mixed) {
        // the arraylist to hold contents of mixed as ints
        ArrayList<Integer> myList = new ArrayList<>();
        int sum = 0; // the total
        // separation of types - ints and strings
        for (Object o : mixed) {
            if (o instanceof String) {
                myList.add(Integer.parseInt((String) o));
            }
            if (o instanceof Integer) {
                myList.add(((Integer) o));
            }
        }

        // computing the sum
        for (Integer integer : myList) {
            sum += integer;
        }
        return sum;
    }
}
