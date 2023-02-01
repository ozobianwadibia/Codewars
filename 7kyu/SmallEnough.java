//You will be given an array and a limit value. You must check that all values in the array are below or equal to the limit value. If they are, return true. Else, return false.
//
//        You can assume all values in the array are numbers.

public class SmallEnough {
    public static boolean smallEnough(int[] a, int limit) {
        // counter for the loop iteration
        var counter = 0;
        for (var i: a) {
            if (i <= limit) {
                counter++;
            }
            if (counter == a.length) {
                return true;
            }
        }
        return false;
    }
}