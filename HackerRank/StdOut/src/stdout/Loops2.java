/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stdout;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Loops2 {

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int a = 0;
        int b = 0;
        int n = 0;
        for (int i = 0; i < t; i++) {
            a = in.nextInt();
            b = in.nextInt();
            n = in.nextInt();
            int sum = a;
            for (int j = 0; j < n; j++) {
                sum += (int) (b * Math.pow(2, j));
                System.out.printf("%d ", sum);
            }
            System.out.println("");

        }
        in.close();

    }
}
