package feb18;

import feb18.classa.Truck;

/**
 *
 * @author Admin
 */
public class Feb18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Truck tr = new Truck(3000, 500000);
        System.out.println(tr.getSalePrice());
    }

}
