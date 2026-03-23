/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson4;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class PracticeSet {

    public static void main(String[] args) {
        //2
        Scanner sc = new Scanner(System.in);
        System.out.println("Give Marks of subject 1");
        int mark1 = sc.nextInt();

        System.out.println("Give Marks of subject 2");
        int mark2 = sc.nextInt();
        System.out.println("Give Marks of subject 3");
        int mark3 = sc.nextInt();
        double total = (mark1 + mark2 + mark3) / 300;

        if (total >= 40 && mark1 >= 33 && mark2 >= 33 && mark3 >= 33) {
            System.out.println("Student Passes");
        } else {
            System.out.println("Student Fails");
        }
        sc.close();
    }

}
