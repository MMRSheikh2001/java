/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package feb5;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Mahbub
 */
public class matrixSum {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Give row number for 1st matrix");
        int rows1 = s.nextInt();
        System.out.println("Give column number for 1st matrix");
        int cols1 = s.nextInt();
        System.out.println("Give row number for 2nd matrix");
        int rows2 = s.nextInt();
        System.out.println("Give column number for 2nd matrix");
        int cols2 = s.nextInt();

        int[][] matrix1 = new int[rows1][cols1];
        int[][] matrix2 = new int[rows2][cols2];

        inputMatrix(rows1, cols1, matrix1, "Matrix 1");
        matrixFormat(matrix1);
        inputMatrix(rows2, cols2, matrix2, "Matrix 2");
        matrixFormat(matrix2);
        int[][] sumMatrix = new int[rows2][cols1];
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols1; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("The Sum of 2 matrices is " + Arrays.deepToString(sumMatrix));
        matrixFormat(sumMatrix);

    }

    public static void inputMatrix(int row, int col, int[][] array, String name) {
        System.out.println("Give values for the " + name);
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Give value for " + (i + 1) + " row x " + (j + 1) + "column ");
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("The array is \n" + Arrays.deepToString(array));
    }

    public static void matrixFormat(int[][] array) {
        System.out.println("The matrix Format array is ");
        for (int row[] : array) {
            for (int single : row) {
                System.out.print(single + "\t");
            }
            System.out.println("\n");
        }
    }

}
