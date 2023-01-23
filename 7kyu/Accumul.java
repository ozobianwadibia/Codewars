//This time no story, no theory. The examples below show you how to write function accum:
//
//        Examples:
//        accum("abcd") -> "A-Bb-Ccc-Dddd"
//        accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
//        accum("cwAt") -> "C-Ww-Aaa-Tttt"


public class Accumul {

    public static String accum(String s) {
        // convert string to array string
        String[] splitWord = s.split("");
        String output = ""; // final output
        for (int i = 0; i < splitWord.length; i++) {
            if (i != splitWord.length - 1) {
                output += ((splitWord[i].repeat(i + 1)).substring(0, 1).toUpperCase() + (splitWord[i].repeat(i + 1)).substring(1).toLowerCase() + "-");
            }
            if (i == splitWord.length - 1) {
                output += ((splitWord[i].repeat(i + 1)).substring(0, 1).toUpperCase() + (splitWord[i].repeat(i + 1)).substring(1).toLowerCase());
            }
        }
        return output;
    }
}