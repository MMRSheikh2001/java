package feb5;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class multiDimensionalArray {

    public static void main(String[] args) {
        int numbers[][] = new int[3][4];

        numbers[0][0] = 1;
        numbers[0][1] = 2;
        numbers[0][2] = 3;
        numbers[0][3] = 4;

        numbers[1][0] = 5;
        numbers[1][1] = 6;
        numbers[1][2] = 7;
        numbers[1][3] = 8;

        numbers[2][0] = 9;
        numbers[2][1] = 10;
        numbers[2][2] = 11;
        numbers[2][3] = 12;
        int sum = 0;

        System.out.println(Arrays.deepToString(numbers));

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Give the array values ");
//        for (int i= 0; i< numbers.length;i++) {
//            for (int s= 0; s< numbers[i].length;s++) {
//                numbers[i][s] = scan.nextInt();
//            }
//        }
//        System.out.println(Arrays.deepToString(numbers));
        for (int item[] : numbers) {
            for (int single : item) {
                System.out.print(single + "\t");
                sum = sum + single;
            }
            System.out.println("\n");
        }

//        for (int item[] : numbers) {
//            for (int single : item) {
//
//                sum = sum + single;
//            }
//
//        }
        System.out.println("Total sum is " + sum);
    }
}
