//Given a set of numbers, return the additive inverse of each. Each positive becomes negatives, and the negatives become positives.
//
//        invert([1,2,3,4,5]) == [-1,-2,-3,-4,-5]
//        invert([1,-2,3,-4,5]) == [-1,2,-3,4,-5]
//        invert([]) == []


public class InvertValues {
    public static int[] invert(int[] array) {

        // new array to hold the modified values
        int[] newArray = new int[array.length];
        if (array.length == 0) {
            return new int[0];
        }
        else {
            for (int i = 0; i < array.length; i++) {
                if (array[i] < 0) {
                    newArray[i] = array[i] * -1;
                }
                if (array[i] > 0) {
                    newArray[i] = array[i] * -1;
                }
            }
        }
        return newArray;
    }
}