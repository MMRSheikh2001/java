/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson15collectionadvancedjava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class ArrayListPrac {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> iList = new ArrayList<>();
        System.out.println("How many Number do you want?");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println("Give Number");
            int n = sc.nextInt();
            iList.add(n);

        }
        System.out.println("The printed array is :");
        for (int i = 0; i < iList.size(); i++) {
            System.out.print(iList.get(i) + "   ");

            if (i % 10 == 0) {
                System.out.println("");
            }

        }

    }
}
