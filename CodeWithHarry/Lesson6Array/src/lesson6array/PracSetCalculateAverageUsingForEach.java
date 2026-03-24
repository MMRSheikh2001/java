/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson6array;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class PracSetCalculateAverageUsingForEach {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give Student Numbers");
        int stu = sc.nextInt();
        double[] marks = new double[stu];
        for (int i = 0; i < stu; i++) {
            System.out.println("Give Marks");
            marks[i] = sc.nextDouble();

        }
        System.out.println("The Marks are : " + Arrays.toString(marks));

        double sum = 0;
        for (double item : marks) {
            sum += item;
        }
        System.out.println("The Sum of Student's Marks are : " + sum);
        System.out.println("The Average mark is :  " + (sum / stu));

    }
}
