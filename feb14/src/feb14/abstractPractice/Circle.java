package feb14.abstractPractice;

import java.util.Date;

/**
 *
 * @author Mahbub
 */
public class Circle extends Geometry {

    private double radius;

    public Circle() {
    }

    public Circle(boolean filled, Date dateCreated) {
        super(filled, dateCreated);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

}
