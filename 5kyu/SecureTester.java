//In this example you have to validate if a user input string is alphanumeric. The given string is not nil/null/NULL/None, so you don't have to check that.
//
//        The string has the following conditions to be alphanumeric:
//
//        At least one character ("" is not valid)
//        Allowed characters are uppercase / lowercase latin letters and digits from 0 to 9
//        No whitespaces / underscore

package test1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SecureTester{

    public static boolean alphanumeric(String s){
        // Regex to validate the string against
        String regex = "[a-zA-Z0-9]+";

        // Compiling the regex
        Pattern p = Pattern.compile(regex);

        // If the string is empty
        if (s == null || s.isEmpty()) {
            return false;
        }
        Matcher m = p.matcher(s);
        return m.matches();
    }
}