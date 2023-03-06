//If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
//
//        Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in. Additionally, if the number is negative, return 0 (for languages that do have them).
//
//        Note: If the number is a multiple of both 3 and 5, only count it once.


package test5;

import java.util.HashSet;

public class Multiples3OR5 {

    public static int solution(int number) {
        if (number < 0) return 0;
        // Hashset to hold all numbers
        HashSet<Integer> multiples = new HashSet<>();
        // populating the hashset with values
        for (int i = 0; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                multiples.add(i);
            }
        }
        // the sum
        int sum = 0;
        for (Integer num : multiples) {
            sum += num;
        }
        return sum;
    }


    public static void main(String[] args) {

        System.out.println(solution(10));
        System.out.println(solution(20));
        System.out.println(solution(30));
    }

}
