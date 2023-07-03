//Your goal in this kata is to implement a difference function, which subtracts one list from another and returns the result.
//
//        It should remove all values from list a, which are present in list b keeping their order.
//
//        Kata.arrayDiff(new int[] {1, 2}, new int[] {1}) => new int[] {2}
//
//        If a value is present in b, all of its occurrences must be removed from the other:
//
//        Kata.arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2}) => new int[] {1, 3}
//

import java.util.ArrayList;

public class ArrayDifference {

    /**
     * Method to subtract one list from another
     * @param a the first array
     * @param b the second array
     * @return the difference, an array
     */
    public static int[] arrayDiff(int[] a, int[] b) {
        // arraylist to hold the contents of the first array
        ArrayList<Integer> listOne = new ArrayList<>();
        for (Integer item : a) {
            listOne.add(item);
        }
        // arraylist to hold the contents of the second array
        ArrayList<Integer> listTwo = new ArrayList<>();
        for (Integer item : b) {
            listTwo.add(item);
        }
        // arraylist to the hold the difference between listOne and listTwo
        ArrayList<Integer> outs = new ArrayList<>();

        listOne.removeAll(listTwo); // calculating the difference

        return listOne.stream().mapToInt(Integer::intValue).toArray();
    }
}