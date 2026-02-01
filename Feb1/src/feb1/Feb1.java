package feb1;

import java.util.Scanner;

public class Feb1 {

    public static void main(String[] args) {
        System.out.println("Give the number whose factorial you want");
        Scanner s = new Scanner(System.in);
        int userInput = s.nextInt();
        int output = factorial(userInput);
        System.out.println("The factorial of " + userInput + " is " + output);
    }

    public static int factorial(int number) {
        int m = 1;
        for (int i = 1; i <= number; i++) {
            m = i * m;
        }
        return m;
        
     //   for(int item : 5){}
    }

}
