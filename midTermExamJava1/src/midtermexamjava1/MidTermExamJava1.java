package midtermexamjava1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class MidTermExamJava1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the Number");
        int n = sc.nextInt();

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("It is prime Number");
        } else {
            System.out.println("It is not prime Number");
        }
    }

}
