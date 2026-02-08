package feb8.pos;

/**
 *
 * @author Mahbub
 */
public class CalculatorOperations {

    private double length, width, radius;
    private float height;

    public CalculatorOperations() {
    }

    public CalculatorOperations(double radius) {
        this.radius = radius;
    }

    public CalculatorOperations(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public CalculatorOperations(double length, float height) {
        this.length = length;
        this.height = height;
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

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
    
    
    
    
    
    
    
}
