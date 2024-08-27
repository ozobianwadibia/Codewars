// Given the string representations of two integers, return the string representation of the sum of those integers.

// For example:

// sumStrings('1','2') // => '3'

// A string representation of an integer will contain no characters besides the ten numerals "0" to "9".

// I have removed the use of BigInteger and BigDecimal in java

public class SumStrings {

    /**
     * Method to compute the addition of two strings
     * 
     * @param stringOne first string
     * @param stringTwo second string
     * @return the sum of the strings
     */

    public static String sumStrings(String stringOne, String stringTwo) {
        StringBuilder output = new StringBuilder();
        int leftOver = 0;
        int i = stringOne.length() - 1;
        int j = stringTwo.length() - 1;

        while (i >= 0 || j >= 0 || leftOver > 0) {
            int total = leftOver;
            if (i >= 0) {
                total += stringOne.charAt(i--) - '0';
            }
            if (j >= 0) {
                total += stringTwo.charAt(j--) - '0';
            }
            output.insert(0, total % 10);
            leftOver = total / 10;
        }

        return output.toString().replaceFirst("^0+", "");
    }

}
