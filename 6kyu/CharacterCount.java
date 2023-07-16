
//The main idea is to count all the occurring characters in a string. If you have a string like aba, then the result should be {'a': 2, 'b': 1}.
//
//   What if the string is empty? Then the result should be empty object literal, {}.

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
    public static Map<Character, Integer> count(String str) {
        // map to contain the final output
        Map<Character, Integer> outs = new HashMap<>();
        // arraylist used to contain and count string characters
        ArrayList<Character> myList = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            myList.add(str.charAt(i));
        }
        // populating the arraylist
        for (int i = 0; i < myList.size(); i++) {
            char ch = myList.get(i);
            int freq = Collections.frequency(myList, myList.get(i));
            outs.put(ch, freq);
        }
        return outs;
    }
}


