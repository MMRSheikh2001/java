package feb14;

import feb14.abstractPractice.Circle;
import feb14.abstractPractice.Geometry;
import feb14.abstractPractice.Rectangle;

/**
 *
 * @author Admin
 */
public class Feb14 {

    public static void main(String[] args) {
        Geometry gCircle = new Circle(5);
        System.out.println(gCircle.getArea());
        System.out.println(gCircle.getPerimeter());

        Geometry gRect = new Rectangle(20, 25);
        System.out.println(gRect.getArea());
        System.out.println(gRect.getPerimeter());

    }

}
