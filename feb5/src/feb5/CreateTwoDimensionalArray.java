package feb5;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class CreateTwoDimensionalArray {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter row  Size");
        int rows = s.nextInt();
        System.out.println("Enter column  Size");
        int cols = s.nextInt();
        int numbers[][] = new int[rows][cols];
        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                System.out.println("Give the value of " + (row + 1) + "th row and " + (col + 1) + "th column ");
                numbers[row][col] = s.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(numbers));
    }
    
}
