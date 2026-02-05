/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package feb5;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * @author Admin
 */
public class ArrayRowSum {
    
    public static void main(String[] args) {
        
    }
    
    public static void rowSum(int array[][]) {
        int sum[] = new int[array[0].length];
        int colSum = 0;
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array.length; col++) {
                colSum += array[col][row];
            }
            sum[row] = colSum;
            colSum = 0;
        }
        System.out.println(Arrays.toString(array));
        
    }
    
}
