//Given an array of integers, find the one that appears an odd number of times.
//
//        There will always be only one integer that appears an odd number of times.
//
//        Examples
//        [7] should return 7, because it occurs 1 time (which is odd).
//        [0] should return 0, because it occurs 1 time (which is odd).
//        [1,1,2] should return 2, because it occurs 1 time (which is odd).
//        [0,1,0,1,0] should return 0, because it occurs 3 times (which is odd).
//        [1,2,2,3,3,3,4,3,3,3,2,2,1] should return 4, because it appears 1 time (which is odd).
//

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class FindOdd {
    public static int FindIt(int[] a) {
        int strayNum = 0; // variable for the odd number

        // using a hash map to stream the array
        Map<Integer, Long> freq = Arrays.stream(a)
                .boxed()
                .collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()));

        // iterate each entry of hashmap
        for(Map.Entry<Integer, Long> entry: freq.entrySet()) {
            // here we seek the key whose value
            // when divided by 2 is 1
            if(entry.getValue() % 2 == 1) {
                strayNum += entry.getKey();
                break;
            }
        }
        return  strayNum;
    }
}