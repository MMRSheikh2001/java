package feb7homeclasspractice.cubeclass;

/**
 *
 * @author Mahbub
 */
public class Cube {

    public float length;

    public double getTotalArea() {
        return 6 * Math.pow(length, 2);
    }

    public double getVolume() {
        return Math.pow(length, 3);
    }
}
