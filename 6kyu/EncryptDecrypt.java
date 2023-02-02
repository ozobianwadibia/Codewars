//Implement a pseudo-encryption algorithm which given a string S and an integer N concatenates all the odd-indexed characters of S with all the even-indexed characters of S, this process should be repeated N times.
//
//        Examples:
//
//        encrypt("012345", 1)  =>  "135024"
//        encrypt("012345", 2)  =>  "135024"  ->  "304152"
//        encrypt("012345", 3)  =>  "135024"  ->  "304152"  ->  "012345"
//
//        encrypt("01234", 1)  =>  "13024"
//        encrypt("01234", 2)  =>  "13024"  ->  "32104"
//        encrypt("01234", 3)  =>  "13024"  ->  "32104"  ->  "20314"
//        Together with the encryption function, you should also implement a decryption function which reverses the process.
//
//        If the string S is an empty value or the integer N is not positive, return the first argument without changes.
//


import java.util.ArrayList;

public class EncryptDecrypt {

    public static String encrypt(final String text, final int n) {
        if (text == null) {
            return null;
        }
        if (text.isEmpty() || text.isBlank()) {
            return "";
        }
        if (n <= 0) {
            return text;
        }
        // char array to hold the string characters
       char[] textArray = text.toCharArray();
        // arraylist for the odd indices
       ArrayList<Character> oddIndices = new ArrayList<>();
        // arraylist for the even indices
       ArrayList<Character> evenIndices = new ArrayList<>();
        // arraylist for the combination of odd and even indices
       ArrayList<Character> allIndices = new ArrayList<>();

       for (int i = 0; i < textArray.length; i++) {
          if (i % 2 == 1) {
              oddIndices.add(textArray[i]); // populating the oddIndices arraylist
          }
          else {
              evenIndices.add(textArray[i]); // populating the evenIndices arraylist
          }
       }
       // combining both smaller arraylists
       allIndices.addAll(oddIndices);
       allIndices.addAll(evenIndices);

       // string builder object for the output
       StringBuilder output = new StringBuilder();

       for (Character allIndex : allIndices) {
            output.append(allIndex);
       }

        return encrypt (output.toString(), n - 1);
    }

    public static String decrypt(final String encryptedText, final int n) {
        if (encryptedText == null) {
            return null;
        }
        if (encryptedText.isEmpty() || encryptedText.isBlank()) {
            return "";
        }
        if (n <= 0) {
            return encryptedText;
        }
        // char array to hold string to be decrypted
        char[] encryptedTextArr = encryptedText.toCharArray();

        // arraylist for the 'odd' indices
        ArrayList<Character> oddIndices = new ArrayList<>();
        // arraylist for the 'even' indices
        ArrayList<Character> evenIndices = new ArrayList<>();
        // arraylist for the combination of 'odd' and 'even' indices
        ArrayList<Character> allIndices = new ArrayList<>();

        int halfway = encryptedTextArr.length / 2; // divide the array in 2
        // removing the 'oddIndices' from char arraylist
        for (int i = 0; i < halfway; i++) {
            oddIndices.add(encryptedTextArr[i]); // extracting the 'odd' indices values
        }
        // removing the 'evenIndices' from char arraylist
        for (int i = halfway; i < encryptedTextArr.length; i++) {
            evenIndices.add(encryptedTextArr[i]); // extracting the 'even' indices values
        }

        int check1 = 0; // counter for 'even' arraylist
        int check2 = 0; // counter for 'odd' arraylist

        // combining the smaller arraylists into bigger one, alternately
        while (check1 < evenIndices.size() || check2 < oddIndices.size()) {
            if (check1 < evenIndices.size())
                allIndices.add(evenIndices.get(check1++));
            if (check2 < oddIndices.size())
                allIndices.add(oddIndices.get(check2++));
        }

        // string builder object for the output
        StringBuilder output = new StringBuilder();

        for (Character allIndex : allIndices) {
            output.append(allIndex);
        }

        return decrypt (output.toString(), n - 1);
    }
}
