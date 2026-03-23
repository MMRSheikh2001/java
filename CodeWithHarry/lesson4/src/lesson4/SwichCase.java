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
public class SwichCase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give day Number of week");
        int day = sc.nextInt();
        day = day % 7;
        sc.close();
        switch (day) {
            case 1:
                System.out.println("Saturday");
                break;
            case 2:
                System.out.println("Sunday");
                break;
            case 3:
                System.out.println("Monday");
                break;
            case 4:
                System.out.println("Tuesday");
                break;
            case 5:
                System.out.println("Wednesday");
                break;
            case 6:
                System.out.println("Thursday");
                break;
            case 0:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Invalid");

        }
        // String can be compared normally in switch case
    }
}
