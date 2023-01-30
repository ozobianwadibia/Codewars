//You are given an odd-length array of integers, in which all of them are the same, except for one single number.
//
//        Complete the method which accepts such an array, and returns that single different number.
//
//        The input array will always be valid! (odd-length >= 3)
//
//        Examples
//        [1, 1, 2] ==> 2
//        [17, 17, 3, 17, 17, 17, 17] ==> 3

import java.util.*;
import java.util.stream.Collectors;

public class StrayNumber {
    public static int stray(int[] numbers) {
        int strayNum = 0; // variable for stray number

        // using a hash map to stream the array
        Map<Integer, Long> freq = Arrays.stream(numbers)
                .boxed()
                .collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()));

        // iterate each entry of hashmap
        for(Map.Entry<Integer, Long> entry: freq.entrySet()) {
            // here we seek the key whose value is 1 (stray number)
            if(entry.getValue() == 1) {
                strayNum += entry.getKey();
                break;
            }
        }
        return  strayNum;
    }
}