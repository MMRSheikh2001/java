/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strings;

import java.io.*;
import java.util.*;

/**
 *
 * @author Administrator
 */
public class StringsIntroduction {

    public static void main(String[] args) {

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
