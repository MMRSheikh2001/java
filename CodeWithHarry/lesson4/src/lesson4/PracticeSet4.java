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
public class PracticeSet4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give Website");
        String web = sc.next();

        if (web.endsWith(".org")) {
            System.out.println("Organization Website");
        } else if (web.endsWith(".com")) {
            System.out.println("Commercial Website");
        } else if (web.endsWith(".bd")) {
            System.out.println("Bangladeshi Website");
        }

    }
}
