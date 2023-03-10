//Given a non-empty array of integers, return the result of multiplying the values together in order. Example:
//
//        [1, 2, 3, 4] => 1 * 2 * 3 * 4 = 24


public class ReduceButGrow {
    public static int grow(int[] x){
        int prod = 1;
        for (int j : x) {
            prod *= j;
        }
        return prod;
    }
}