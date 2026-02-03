package feb3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Feb3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("How many numbers do you want to Sort?");
        int n = s.nextInt();

        int numbers[] = new int[n];
        System.out.println("Beginning of Loop \n" + Arrays.toString(numbers));

        for (int i = 0; i < n; i++) {
            System.out.println("Give the " + (i + 1) + " th Number");
            int userInput = s.nextInt();
            numbers[i] = userInput;
        }
        System.out.println("End of Loop \n" + Arrays.toString(numbers));
        numbers = bubleSort(numbers);
        System.out.println("The Sorted array is " + Arrays.toString(numbers));
    }

    public static int[] bubleSort(int array[]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

}
