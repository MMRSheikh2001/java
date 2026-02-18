/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package feb18;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class LowestAndHighest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numbers[] = new double[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Give The " + (i + 1) + "th Number");
            numbers[i] = sc.nextDouble();
        }

//        Arrays.sort(numbers);
//        System.out.println("The lowest Number is "+ numbers[0]);
//        System.out.println("The highest Number is "+ numbers[4]);
//        for (int i = 0; i < 4; i++) {
//            if (numbers[i] >= numbers[i + 1]) {
//                double temp = numbers[i];
//                numbers[i] = numbers[i + 1];
//                numbers[i + 1] = temp;
//            }
//        }
//        System.out.println("The Highest Number is " + numbers[4]);
//        for (int i = 0; i < 4; i++) {
//            if (numbers[i] <= numbers[i + 1]) {
//                double temp = numbers[i];
//                numbers[i] = numbers[i + 1];
//                numbers[i + 1] = temp;
//            }
//        }
//        System.out.println("The lowest Number is " + numbers[4]);
        double max = numbers[0];
        double min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("The highest number is " + max);
        System.out.println("The lowest number is " + min);

    }
}
