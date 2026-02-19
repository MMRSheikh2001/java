
package feb19exampractice.cllass;

/**
 *
 * @author Admin
 */
public class Truck extends Vehicle {

    public int weight;

    public Truck() {
    }

    public Truck(int weight, double regularPrice) {
        super(regularPrice);
        this.weight = weight;
    }

    @Override
    public double getSalePrice() {
        if (weight > 2000) {
            return regularPrice - regularPrice * 0.1;
        } else {
            return regularPrice;
        }
    }

}
