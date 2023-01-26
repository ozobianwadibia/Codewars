//The rgb function is incomplete. Complete it so that passing in RGB decimal values will result in a hexadecimal representation being returned. Valid decimal values for RGB are 0 - 255. Any values that fall out of that range must be rounded to the closest valid value.
//
//        Note: Your answer should always be 6 characters long, the shorthand with 3 will not work here.
//
//        The following are examples of expected output values:
//
//        RgbToHex.rgb(255, 255, 255) // returns FFFFFF
//        RgbToHex.rgb(255, 255, 300) // returns FFFFFF
//        RgbToHex.rgb(0, 0, 0)       // returns 000000
//        RgbToHex.rgb(148, 0, 211)   // returns 9400D3


public class RgbToHex {

    public static String rgb(int r, int g, int b) {
        if (r < 0) {
            r =  0;
        }
        if (r > 255) {
            r = 255;
        }
        if (g < 0) {
            g =  0;
        }
        if (g > 255) {
            g = 255;
        }
        if (b < 0) {
            b =  0;
        }
        if (b > 255) {
            b = 255;
        }

        String hex1 = (r <= 15) ? "0" + Integer.toHexString(r).toUpperCase() : Integer.toHexString(r).toUpperCase();
        String hex2 = (g <= 15) ? "0" + Integer.toHexString(g).toUpperCase() : Integer.toHexString(g).toUpperCase();
        String hex3 = (b <= 15) ? "0" + Integer.toHexString(b).toUpperCase() : Integer.toHexString(b).toUpperCase();

        return hex1 + hex2 + hex3;
    }

}

