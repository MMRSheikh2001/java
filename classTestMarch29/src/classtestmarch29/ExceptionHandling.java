/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classtestmarch29;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class ExceptionHandling {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number ");

        try {
            int n = sc.nextInt();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("You had to enter only a integer number");
        }
    }
}
