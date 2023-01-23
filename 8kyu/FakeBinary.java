//Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and above with '1'. Return the resulting string.
//
//        Note: input will never be an empty string

public class FakeBinary {
    public static String fakeBin(String numberString) {
        if (numberString.isEmpty()) {
            return numberString;
        }
        String[] nums = numberString.split("");
        for (int i = 0; i < nums.length; i++) {
            var x = "0";
            var y = "1";
            if (Integer.parseInt(nums[i]) < 5) {
                nums[i] = x;
            }
            if (Integer.parseInt(nums[i]) >= 5) {
                nums[i] = y;
            }
        }
        return String.join("", nums);
    }
}