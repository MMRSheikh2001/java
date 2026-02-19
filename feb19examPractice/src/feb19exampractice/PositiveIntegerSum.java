package feb19exampractice;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class PositiveIntegerSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give only Positive Integers");
        int n = sc.nextInt();
        int sum = 0;
        while (n > 0) {
            sum = n + sum;
            n = sc.nextInt();
        }
        System.out.println("The sum of positive integers are " + sum);
    }
}
