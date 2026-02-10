package feb10.Vehicle;

/**
 *
 * @author Admin
 */
public class Truck extends Vehicle {

    public int weight;
    public double salePrice;

    public Truck() {
    }

    public Truck(int weight, double regularPrice) {
        super(regularPrice);
        this.weight = weight;
    }

    @Override
    public double getSalePrice() {
        if (weight > 2000) {
            salePrice = super.regularPrice - super.regularPrice * 0.1;
            return salePrice;
        } else {
            return super.salePrice;
        }

    }

}
