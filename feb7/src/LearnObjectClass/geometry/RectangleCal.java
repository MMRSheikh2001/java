
package LearnObjectClass.geometry;

/**
 *
 * @author Admin
 */
public class RectangleCal {

    public float length;
    public float width;

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

}
