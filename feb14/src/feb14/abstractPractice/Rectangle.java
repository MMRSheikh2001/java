package feb14.abstractPractice;

import java.util.Date;

/**
 *
 * @author Mahbub
 */
public class Rectangle extends Geometry {

    private double length, width;

    public Rectangle() {
    }

    public Rectangle(boolean filled, Date dateCreated) {
        super(filled, dateCreated);
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {

        return length * width;
    }

    @Override
    public double getPerimeter() {

        return 2 * (length + width);
    }

}
