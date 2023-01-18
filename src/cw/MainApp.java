package cw;
import java.util.Arrays;
/*
* "Point reflection" or "point symmetry" is a basic concept in geometry where a given point, P,
* at a given position relative to a mid-point, Q has a corresponding point, P1,
* which is the same distance from Q but in the opposite direction.
* Given two points P and Q, output the symmetric point of point P about Q.
* Each argument is a two-element array of integers representing the point's X and Y coordinates.
* Output should be in the same format, giving the X and Y coordinates of point P1.
*/

public class MainApp {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(reflectPoint(new int[]{0, 1}, new int[] {0, -2})));
    }

    public static int[] reflectPoint(int[] p, int[] q) {
        int x = q[0] - (p[0] - q[0]);
        int y = q[1] - (p[1] - q[1]);
        return new int[] { x, y };
    }
}
