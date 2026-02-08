package feb8;

import feb8.pos.POS;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Feb8 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        POS pos = new POS();
        System.out.println("Give Unit Price");
        double unitPrice = s.nextDouble();
        System.out.println("Give Quantity");
        double quantity = s.nextDouble();
        System.out.println("The actual Price is " + pos.getFinalPrice(unitPrice, quantity));
    }
    
}
