//In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.
//
//        Examples
//        highAndLow("1 2 3 4 5")  // return "5 1"
//        highAndLow("1 2 -3 4 5") // return "5 -3"
//        highAndLow("1 9 3 4 -5") // return "9 -5"

import java.util.ArrayList;
import java.util.Collections;

public class Kata {
    public static String highAndLow(String numbers) {
        // arraylist to hold the converted strings
        ArrayList<Integer> nums = new ArrayList<>();
        // convert string to string array
        String[] stringWords = numbers.split(" ");
        // loop through the string array, populate arraylist with
        // converted values
        for (String stringWord : stringWords) {
            nums.add(Integer.parseInt(stringWord));
        }
        int max = Collections.max(nums); // the max
        int min = Collections.min(nums); // the min
        return String.valueOf(max).concat(" ").concat(String.valueOf(min));
    }
}