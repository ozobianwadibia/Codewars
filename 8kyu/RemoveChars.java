//It's pretty straightforward. Your goal is to create a function that removes the first and last characters of a string. You're given one parameter, the original string. You don't have to worry with strings with less than two characters.

public class RemoveChars {
    public static String remove(String str) {

        if (str.length() < 2) {
            return "";
        }

        // create a stringbuilder object for teh string
        StringBuilder word = new StringBuilder(str);
        // delete last character first, then the first character and return
        return  (word.deleteCharAt(str.length() - 1).deleteCharAt(0)).toString();
    }
}