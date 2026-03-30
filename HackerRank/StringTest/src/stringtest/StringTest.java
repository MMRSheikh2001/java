/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringtest;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class StringTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length() + B.length());
        String a = A.substring(0, 1).toUpperCase();
        String a1 = A.substring(1).toLowerCase();
        String b = B.substring(0, 1).toUpperCase();
        String b1 = B.substring(1).toLowerCase();

        if (A.charAt(0) > B.charAt(0)) {
            System.out.println("Yes");

        } else {
            System.out.println("No");
        }

        System.out.println(a + a1 + " " + b + b1);
    }

}
