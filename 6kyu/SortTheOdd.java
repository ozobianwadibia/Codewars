// Task
// You will be given an array of numbers. You have to sort the odd numbers in ascending order while leaving the even numbers at their original positions.

// Examples
// [7, 1]  =>  [1, 7]
// [5, 8, 6, 3, 4]  =>  [3, 8, 6, 5, 4]
// [9, 8, 7, 6, 5, 4, 3, 2, 1, 0]  =>  [1, 8, 3, 6, 5, 4, 7, 2, 9, 0]

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortTheOdd {

    public static int[] sortArray(int[] array) {
        // convert the array to arrayList
        ArrayList<Integer> myList = new ArrayList<Integer>();
        for (int val : array) {
            myList.add(val);
        }

        // arraylist for odd values
        ArrayList<Integer> oddInts = new ArrayList<Integer>();
        // arraylist for the indices of odd values
        ArrayList<Integer> oddIntsIndex = new ArrayList<Integer>();

        // populating both arraylists
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i) % 2 != 0) {
                oddInts.add(myList.get(i));
                oddIntsIndex.add(i);
            }
        }
        // Sort ArrayList in ascending Order
        Collections.sort(oddInts);

        // updating the values of the main arraylist
        for (int i = 0; i < oddInts.size(); i++) {
            for (int j = 0; j < oddIntsIndex.size(); j++) {
                myList.set(oddIntsIndex.get(j), oddInts.get(j));
            }
        }
        // ArrayList to Array Conversion
        int[] arr = myList.stream().mapToInt(x -> x).toArray();

        return arr;

    }

    public static void main(String[] args) throws Exception {
        int[] test = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };

        System.out.println("Initial is: " + Arrays.toString(test));
        System.out.println();
        System.out.println("Sorted is: " + Arrays.toString(sortArray(test)));

    }
}
