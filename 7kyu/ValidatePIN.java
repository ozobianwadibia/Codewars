//ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits.
//
//        If the function is passed a valid PIN string, return true, else return false.
//        Examples (Input --> Output)
//
//        "1234"   -->  true
//        "12345"  -->  false
//        "a234"   -->  false

public class ValidatePIN {

    public static boolean validatePin(String pin) {
        int length = pin.length(); // length of the string
        String str = pin.replaceAll("[^0-9]", "");
        for (int i = 0; i < length; i++) {
            if ((length == 4 || length == 6) && (str.length() == length)) {
                return true;
            }
        }
        return false;
    }
}

