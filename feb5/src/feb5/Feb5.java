package feb5;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Feb5 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Give the array length");
        int n = s.nextInt();
        int numbers[] = new int[n];
        System.out.println("Before loop " + Arrays.toString(numbers));
        for (int i = 0; i < n; i++) {
            System.out.println("Give the " + (i + 1) + "th number");
            numbers[i] = s.nextInt();
        }
        System.out.println("After the Loop " + Arrays.toString(numbers));
        
        Arrays.sort(numbers);
        System.out.println("The sorted array is "+ Arrays.toString(numbers));
        
        System.out.println("Give the number whose index position you want in array");
        int userSearchingNumber = s.nextInt();
        System.out.println("The linear search position is " + Arrays.binarySearch(numbers, userSearchingNumber));
    }

}
