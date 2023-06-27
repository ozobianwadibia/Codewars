//    You are given two interior angles (in degrees) of a triangle.
//
//    Write a function to return the 3rd.
//
//    Note: only positive integers will be tested.

public class ThirdAngle {
    /**
     * Method to compute the third angle
     * @param angle1 first angle
     * @param angle2 second angle
     * @return the third angle
     */
    public static int otherAngle(int angle1, int angle2) {
        return 180 - angle1 - angle2;
    }
}
