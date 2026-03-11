/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multithreadprac;

/**
 *
 * @author Admin
 */
public class fibonacciNumb {

    public static void main(String[] args) {
        int i = 0;
        int j = 1;
        System.out.println(i + "\n" + j);
        for (int index = 0; index < 7; index++) {
            int k = i + j;
            i = j;
            j = k;
            System.out.println(k);
        }
    }
}
