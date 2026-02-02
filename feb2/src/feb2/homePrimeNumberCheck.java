/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package feb2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Mahbub
 */
public class homePrimeNumberCheck {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("How many Numbers do you want to check if they are prime Numbers?");
        int n = s.nextInt();
        int numbers[] = new int[n];

        System.out.println("The beginning of Loop is " + Arrays.toString(numbers));
        for (int i = 0; i < n; i++) {
            System.out.println("Give the " + (i + 1) + " th number");
            int userInput = s.nextInt();
            numbers[i] = userInput;
        }
        System.out.println("The end of Loop is " + Arrays.toString(numbers));
        primeNumbers(numbers);
        
    }

    public static void primeNumbers(int numbers[]) {
        int s = numbers.length;

        int count = 0;
        for (int i=0;i<s;i++) {
            if (numbers[i] % 2 == 0) {
                count++;
            }
            if (count != 2) {
                numbers[i] = 0;
            }
        }
        
        System.out.println("The Prime Number Array is " + Arrays.toString(numbers));

    }

}
