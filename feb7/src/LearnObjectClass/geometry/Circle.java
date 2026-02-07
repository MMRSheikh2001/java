
package LearnObjectClass.geometry;

/**
 *
 * @author Admin
 */
public class Circle {

    public double radius;

    public double getArea() {

        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
