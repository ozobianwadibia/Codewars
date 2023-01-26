// Welcome. In this kata, you are asked to square every digit of a number and concatenate them.
// For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1. (81-1-1-81)
// Example #2: An input of 765 will/should return 493625 because 72 is 49, 62 is 36, and 52 is 25. (49-36-35)
// Note: The function accepts an integer and returns an integer.


import java.util.ArrayList;

public class SquareDigit {

    public int squareDigits(int n) {

        // arraylist for the separated digits of the given number
        ArrayList<Integer> strToInt = new ArrayList<>();
        // arraylist for the squares of the digits
        ArrayList<Integer> numSquare = new ArrayList<>();
        // arraylist for the squares, turned into strings
        ArrayList<String> intToStr = new ArrayList<>();

        if (n == 0) {
            return 0;
        } else {
            // convert the number into string
            String numToStr = String.valueOf(n);
            for (int i = 0; i < numToStr.length(); i++) {
                // store digits as separate entries
                strToInt.add(Integer.parseInt(Character.toString(numToStr.charAt(i))));
            }
            for (Integer integer : strToInt) {
                // store the squares of the digits in a new arraylist
                numSquare.add(integer * integer);
            }

            for (Integer integer : numSquare) {
                // convert the squares into strings and
                // store in another arraylist
                intToStr.add(String.valueOf(integer));
            }
            // stringbuilder object for the final output
            StringBuilder finalString = new StringBuilder();
            for (String s : intToStr)
            {
                finalString.append(s);
            }
            return Integer.parseInt(finalString.toString());
        }
    }
}