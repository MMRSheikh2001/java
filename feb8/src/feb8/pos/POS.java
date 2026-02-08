package feb8.pos;

/**
 *
 * @author Admin
 */
public class POS {

    public double getFinalPrice(double unitPrice, double quantity) {
        double grossPrice = unitPrice * quantity;
        double actualPrice;
        if (grossPrice <= 100) {
            actualPrice = grossPrice - grossPrice * 0.02;
        } else if (grossPrice <= 200) {
            actualPrice = grossPrice - grossPrice * 0.03;
        } else if (grossPrice <= 400) {
            actualPrice = grossPrice - grossPrice * 0.04;
        } else {
            actualPrice = grossPrice - grossPrice * 0.05;
        }

        return actualPrice;
    }

}
