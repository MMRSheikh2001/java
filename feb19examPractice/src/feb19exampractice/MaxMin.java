package feb19exampractice;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Mahbub
 */
public class MaxMin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers[] = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Give the " + (i + 1) + "th Number");
            numbers[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(numbers));

        int min = numbers[0];
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }

        }
        System.out.println("The highest Number is "+ max);
        System.out.println("The lowest Number is "+ min);
    }
}
