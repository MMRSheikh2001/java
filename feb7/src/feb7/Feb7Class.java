package feb7;

import LearnObjectClass.geometry.Circle;
import LearnObjectClass.geometry.RectangleCal;
import LearnObjectClass.geometry.Triangle;

/**
 *
 * @author Admin
 */
public class Feb7Class {

    public static void main(String[] args) {
        Circle c = new Circle();
        RectangleCal r = new RectangleCal();
        c.radius = 12;
        System.out.println("The area and perimeter of Circle is \n"+ c.getArea() +"\n"+ c.getPerimeter());
        
        r.length = 14;
        r.width = 24;
        System.out.println("The area and perimeter of Rectangle  is \n"+ r.getArea() +"\n"+ r.getPerimeter());
        
        Triangle t = new Triangle();
        t.side1 = 7;
        t.side2 = 12;
        t.side3 = 13;
        System.out.println("The area and perimeter of Triangle  is \n"+ t.getArea() +"\n"+ t.getPerimeter());
    }

}
