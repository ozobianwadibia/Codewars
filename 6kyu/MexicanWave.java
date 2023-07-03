//        The wave (known as the Mexican wave in the English-speaking world outside North America) is an example of metachronal rhythm achieved in a packed stadium when successive groups of spectators briefly stand, yell, and raise their arms. Immediately upon stretching to full height, the spectator returns to the usual seated position.
//
//        The result is a wave of standing spectators that travels through the crowd, even though individual spectators never move away from their seats. In many large arenas the crowd is seated in a contiguous circuit all the way around the sport field, and so the wave is able to travel continuously around the arena; in discontiguous seating arrangements, the wave can instead reflect back and forth through the crowd. When the gap in seating is narrow, the wave can sometimes pass through it. Usually only one wave crest will be present at any given time in an arena, although simultaneous, counter-rotating waves have been produced. (Source Wikipedia)
//
//        Task
//
//        In this simple Kata your task is to create a function that turns a string into a Mexican Wave. You will be passed a string and you must return that string in an array where an uppercase letter is a person standing up.
//
//        Rules
//
//        1.  The input string will always be lower case but maybe empty.
//
//        2.  If the character in the string is whitespace then pass over it as if it was an empty seat
//
//        Example
//
//        wave("hello") => {"Hello", "hEllo", "heLlo", "helLo", "hellO"}



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MexicanWave {

    /**
     * Method to capitalize words at specified indices
     * @param str the given string
     * @return a string array with the modified words
     */
    public static String[] wave(String str) {
        // arraylist to hold the new strings
        ArrayList<String> wave = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            wave.add(str.substring(0, i) + Character.toUpperCase(str.charAt(i)) + str.substring(i + 1));
        }
        // string array containing all modified strings
        String[] output = new String[wave.size()];
        for (int i = 0; i < wave.size(); i++) {
            output[i] = wave.get(i);
        }
        // list to contain filtered strings
        List<String> filteredWords = Arrays.stream(output).filter(word -> {
                    for (int i = 0; i < word.length(); i++) {
                        if (Character.isUpperCase(word.charAt(i))) {
                            return true;
                        }
                    }
                    return false;
                }).toList();

        // Convert list to array: Java 8 syntax(Stackoverflow)
        // String[] strings = filteredWords.stream().toArray(String[]::new);
        // Convert list to array: Java 11 syntax (Stackoverflow)
        String[] strings = filteredWords.toArray(String[]::new);
        return strings;
    }

}