package feb10.Vehicle;

/**
 *
 * @author Admin
 */
public class Vehicle {

    public int speed;
    public double regularPrice;
    public String color;
    public double salePrice;

    public Vehicle() {
    }

    public Vehicle(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public Vehicle(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }

    public double getSalePrice() {

        salePrice = regularPrice;
        return salePrice;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "salePrice=" + salePrice + '}';
    }

}
