/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise1cbseboardpercentagecalculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Exercise1CBSEBoardPercentageCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        List<Double> precentageMarks = new ArrayList<>();
        double total = 0;
        int count = 0;

        System.out.println("Give Mark type -1 to stop");
        double marks = sc.nextDouble();
        while (sc.hasNextDouble()) {

            total += marks;
            count++;
            System.out.println("Give Mark type -1 to stop");
            marks = sc.nextDouble();

        }
        System.out.println("Total Marks : " + total);
    }

}
