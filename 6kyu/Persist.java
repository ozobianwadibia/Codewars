//Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence, which is the number of times you must multiply the digits in num until you reach a single digit.
//
//        For example (Input --> Output):
//
//        39 --> 3 (because 3*9 = 27, 2*7 = 14, 1*4 = 4 and 4 has only one digit)
//        999 --> 4 (because 9*9*9 = 729, 7*2*9 = 126, 1*2*6 = 12, and finally 1*2 = 2)
//        4 --> 0 (because 4 is already a one-digit number)

public class Persist {

    /**
     * Method to extract the digits from a number
     * @param myNUm the number
     * @return a string array of digits
     */
    private static String[] getDigits(long myNUm) {
        String num = String.valueOf(myNUm);
        return num.split("");
    }

    /**
     * Method to calculate the product sum
     * of elements in array
     * @param nums the array
     * @return an integer
     */
    private static int productSum(String[]nums) {
        int prodSum = 1;
        for (String num : nums) {
            prodSum *= Integer.parseInt(num);
        }
        return prodSum;
    }

    public static int persistence(long n) {
        if (n < 10) {
            return 0;
        }
        if (String.valueOf(n).contains("0")) {
            return 1;
        }
        int counter = 0;
        while (n >= 10) {
          n = productSum(getDigits(n));
          counter++;
        }
        return counter;
    }
}