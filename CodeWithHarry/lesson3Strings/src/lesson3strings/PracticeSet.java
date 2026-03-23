/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson3strings;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class PracticeSet {

    public static void main(String[] args) {
        //1
        Scanner sc = new Scanner(System.in);
        System.out.println("Give String");
        String input = sc.nextLine();
        System.out.println("The Lowercase String :" + input.toLowerCase());

        //2
        String replaced = input.replace(' ', '_');
        System.out.println("The underscore text is : " + replaced);

        //3
        String letter = "Dear name , Thanks a lot";
        String replacedd = letter.replace("name", "Mahbub");
        System.out.println(replacedd);

        //4
        String space = "This text contains  double and   triple spaces";
        System.out.println(space.indexOf("  "));
        System.out.println(space.indexOf("   "));

        //5
        String letter2 = "\"Dear Mahbub, This java proggramming Language is Best.Thanks.\"";
        System.out.println(letter2);

    }
}
