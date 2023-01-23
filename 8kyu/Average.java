//Write a function which calculates the average of the numbers in a given list.
//
//        Note: Empty arrays should return 0.


public class Average {
    public static double find_average(int[] array){
        double sum = 0.0;
        double avg = 0.0;
        if (array.length == 0) {
            return 0;
        }
        else {
            for (int j : array) {
                sum += j;
            }
            avg = sum / (array.length);
        }
        return avg;
    }
}