/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson7methods;

/**
 *
 * @author Administrator
 */
public class PracSetMultiplicationTablePrintStars {

    public static void main(String[] args) {
        PracSetMultiplicationTablePrintStars pmt = new PracSetMultiplicationTablePrintStars();
        pmt.makeMultiplicationTable(13);
        pmt.printAscendingStars();
        System.out.println("");
        pmt.printDescendingStars();
        System.out.println(pmt.sumOfNaturalNumbersIterative(4));
        System.out.println(pmt.sumOfNaturalNumbersRecursive(4));
        System.out.println(pmt.findAverage(12, 23, 34, 45, 56, 67, 78, 89));
        System.out.println(pmt.convertCelciusToFarenheit(12));
        System.out.println(pmt.findnThFibonacciSeriesNumberRecursion(5));
        pmt.printAscendingStarsRecursion(4);
        System.out.println("");
        pmt.printDescendingStarsRecursion(5);

    }

    public void makeMultiplicationTable(int n) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + n + " = " + i * n);

        }
    }

    public void printAscendingStars() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*\t");

            }
            System.out.println("");
        }

    }

    public void printDescendingStars() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print("*\t");
            }
            System.out.println("");
        }

    }

    public int sumOfNaturalNumbersIterative(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }

    public int sumOfNaturalNumbersRecursive(int n) {

        if (n == -1) {
            return 0;
        }

        return n + sumOfNaturalNumbersRecursive(n - 1);
    }

    public double findAverage(int... num) {
        int sum = 0;
        for (int i : num) {
            sum += i;

        }
        double avg = sum / (num.length);
        return avg;
    }

    public double convertCelciusToFarenheit(double cel) {
        double far;
        far = cel * 1.8 + 32;

        return far;
    }

    public int findnThFibonacciSeriesNumberRecursion(int n) {

        if (n == 1) {

            return 0;
        } else if (n == 2) {

            return 1;
        } else {

            return findnThFibonacciSeriesNumberRecursion(n - 1) + findnThFibonacciSeriesNumberRecursion(n - 2);
        }

    }

    public void printAscendingStarsRecursion(int n) {
        if (n > 0) {
            printAscendingStarsRecursion(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print(" * ");
            }
            System.out.println("");

        }

    }

    public void printDescendingStarsRecursion(int n) {
        if (n > 0) {

            for (int i = n; i >= 1; i--) {
                System.out.print(" * ");

            }
            System.out.println("");
            printDescendingStarsRecursion(n - 1);
        }

    }

}
