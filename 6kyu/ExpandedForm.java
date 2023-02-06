import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ExpandedForm {
    public static String expandedForm(int num) {
        // single digit number
        if (num >= 0 && num <= 10) {
            return String.valueOf(num);
        }
        // convert number to string
        String myNum = String.valueOf(num);
        // arraylist to hold numbers that will be created
        ArrayList<String> nums = new ArrayList<>();
        int ex = 0; // exponent
        // looping through the string in reverse
        for (int i = myNum.length() - 1; i >= 0; i--) {
            nums.add(String.valueOf(Integer.parseInt(String.valueOf(myNum.charAt(i))) * (int)(Math.pow(10, ex))));
            ex++;
        }
        Collections.reverse(nums); // reversing the arraylist

        // Creating string iterator object
        Iterator<String> myItr = nums.iterator();
        // looping with the iterator
        while (myItr.hasNext()) {
            // Remove elements equal to "0"
            String zero = myItr.next();
            if (zero.equals("0"))
                myItr.remove();
        }

        // string builder object for output
        StringBuilder finalOutput = new StringBuilder();
        // append all but the last element
        for (int i = 0; i < nums.size() - 1; i++) {
            finalOutput.append(nums.get(i)).append(" + ");
        }
        // append the last element
        finalOutput.append(nums.get(nums.size() - 1));
        return finalOutput.toString();
    }
}