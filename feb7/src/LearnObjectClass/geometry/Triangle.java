package LearnObjectClass.geometry;

/**
 *
 * @author Admin
 */
public class Triangle {

    public double side1, side2, side3;

    public double getPerimeter() {
        return (side1 + side2 + side3);
    }
    public double getArea(){
        double s = getPerimeter()/2;
        double area = Math.pow((s * (s-side1)* (s-side2)* (s-side3)), 0.5);
    return area;
    }

}
