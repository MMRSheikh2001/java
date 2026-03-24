/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson6array;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class MultidimensionalArray {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Give Row Number");
        int r = sc.nextInt();
        System.out.println("Give Column Numbers");
        int c = sc.nextInt();
        int[][] flats = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("Give The " + (i + 1) + "th row and " + (j + 1) + "th column");
                flats[i][j] = sc.nextInt();
                
            }
        }
        sc.close();
        System.out.println("The new Array is : " + Arrays.deepToString(flats));
        
    }
}
