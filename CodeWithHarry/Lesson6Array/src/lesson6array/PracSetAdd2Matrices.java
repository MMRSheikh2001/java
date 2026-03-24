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
public class PracSetAdd2Matrices {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give Row Number");
        int r = sc.nextInt();
        System.out.println("Give Column Numbers");
        int c = sc.nextInt();
        int[][] mat1 = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("Give The " + (i + 1) + "th row and " + (j + 1) + "th column");
                mat1[i][j] = sc.nextInt();

            }
        }

        System.out.println("The 1st Array is : " + Arrays.deepToString(mat1));
        int[][] mat2 = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("Give The " + (i + 1) + "th row and " + (j + 1) + "th column");
                mat2[i][j] = sc.nextInt();

            }
        }

        System.out.println("The 2nd Array is : " + Arrays.deepToString(mat2));
        int[][] sum = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sum[i][j] = mat1[i][j] + mat2[i][j];

            }
        }

        System.out.println("The new Array is " + Arrays.deepToString(sum));

    }
}
