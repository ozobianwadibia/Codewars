//Given an array of integers.
//
//        Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers. 0 is neither positive nor negative.
//
//        If the input is an empty array or is null, return an empty array.
//
//        Example
//        For input [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15], you should return [10, -65].


public class PositivesAndNegatives
{
    public static int[] countPositivesSumNegatives(int[] input)
    {
        // empty array for when the input is null
        int[] noOutput = {};
        int numOfPositives = 0;
        int sumOfNegatives = 0;

        if (input == null) {
            return noOutput;
        }

        if (input.length == 0) {
            return noOutput;
        }

        int[] someOutput = new int[2];
        if (input.length > 0) {
            for (int j : input) {
                if (j > 0) {
                    numOfPositives++;
                }
                if (j < 0) {
                    sumOfNegatives += j;
                }
            }
            someOutput[0] = numOfPositives;
            someOutput[1] = sumOfNegatives;
        }
        return someOutput;
        //return an array with count of positives and sum of negatives
    }
}