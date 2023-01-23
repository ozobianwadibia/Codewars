//Write a function that takes in a string of one or more words, and returns the same string, but with all five or more letter words reversed (Just like the name of this Kata). Strings passed in will consist of only letters and spaces. Spaces will be included only when more than one word is present.
//
//        Examples:
//
//        spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw"
//        spinWords( "This is a test") => returns "This is a test"
//        spinWords( "This is another test" )=> returns "This is rehtona test"


public class SpinWords {

    public String spinWords(String sentence) {
        // stringbuilder object for the final sentence
        StringBuilder finalSentence = new StringBuilder();
        // string array to hold the words of the sentence
        String [] sentenceStrgs = sentence.split(" ");
        for (int i = 0; i < sentenceStrgs.length; i++) {
            // checking for length of 5 or greater
            if (sentenceStrgs[i].length() >= 5) {
                sentenceStrgs[i] = new StringBuilder(sentenceStrgs[i]).reverse().toString();
            }
        }
        // appending string array values to initial stringbuilder
        for (int i = 0; i < sentenceStrgs.length; i++) {
            finalSentence.append(" ").append(sentenceStrgs[i]);
        }
        return finalSentence.toString().trim();
    }
}