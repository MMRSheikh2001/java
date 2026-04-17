/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strings;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class StringReversePalindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String B = "";
        for (int i = A.length() - 1; i >= 0; i--) {
            B += A.charAt(i);
        }
        if (B.equals(A)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
