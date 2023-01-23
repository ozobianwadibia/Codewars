//Complete the function that accepts a string parameter, and reverses each word in the string. All spaces in the string should be retained.

//        Examples
//        "This is an example!" ==> "sihT si na !elpmaxe"
//        "double  spaces"      ==> "elbuod  secaps"

public class ReverseWords {
    // method to reverse one word
    public static String revOneWord(String origin) {
        StringBuilder myObj = new StringBuilder();
        myObj.append(origin);
        myObj.reverse();
        return myObj.toString();
    }

    public static String reverseWords(final String original) {
        if (original == null || original.length() == 0 || original.isBlank()) {
            return original;
        }

        else {
            String[] splitWords = original.split(" ");
            for (int i = 0; i < (splitWords.length - 1); i++) {
                splitWords[i] = reverseWords(splitWords[i]).concat(" ");
            }
            splitWords[splitWords.length - 1] = revOneWord(splitWords[splitWords.length - 1]);
            return String.join("", splitWords);
        }

    }
}