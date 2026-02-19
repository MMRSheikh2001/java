package feb19exampractice;

import feb19exampractice.cllass.Factorial;
import feb19exampractice.cllass.Truck;

/**
 *
 * @author Admin
 */
public class Feb19examPractice {

    public static void main(String[] args) {
        Truck tr = new Truck(3400, 500000);
        System.out.println("Truck Sale Price is " + tr.getSalePrice());

        Factorial fl = new Factorial(5);
        System.out.println("Factorial of 5 is " + fl.getFactorial());
    }

}
