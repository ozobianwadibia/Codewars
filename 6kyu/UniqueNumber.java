//There is an array with some numbers. All numbers are equal except for one. Try to find it!
//
//        Kata.findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }); // => 2
//        Kata.findUniq(new double[]{ 0, 0, 0.55, 0, 0 }); // => 0.55
//
//        It’s guaranteed that array contains at least 3 numbers.
//
//        The tests contain some very huge arrays, so think about performance.



import java.util.Arrays;

public class UniqueNumber {

    /**
     * Method to compute the unique number in an array
     * @param arr the given array
     * @return the unique number
     */
    public static double findUniq(double[] arr) {
        // sort the array in ascending order
        Arrays.sort(arr);
        double ans = 0.0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[0] == arr[1]) && (arr[0] < arr[arr.length - 1])) {
                ans += arr[arr.length - 1];
                break;
            }
            if (arr[0] < arr[arr.length - 1]) {
                ans += arr[0];
                break;
            }
        }
        return ans;
    }
}
