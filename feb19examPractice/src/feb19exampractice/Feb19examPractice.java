package feb19exampractice;

import feb19exampractice.cllass.Factorial;
import feb19exampractice.cllass.PrimeNumber;
import feb19exampractice.cllass.Truck;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Feb19examPractice {

    public static void main(String[] args) {
        Truck tr = new Truck(3400, 500000);
//        tr.weight=3400;
//        tr.regularPrice= 450000;
        System.out.println("Truck Sale Price is " + tr.getSalePrice());

        Factorial fl = new Factorial(5);
        System.out.println("Factorial of 5 is " + fl.getFactorial());

        Scanner sc = new Scanner(System.in);
        System.out.println("Give The number you want test if that is Prime number");
        int userInput = sc.nextInt();
        PrimeNumber pn = new PrimeNumber(userInput);
        sc.close();
        pn.isItPrimeNumber();
    }

}
