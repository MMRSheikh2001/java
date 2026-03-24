/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lesson7methods;

/**
 *
 * @author Administrator
 */
public class Lesson7Methods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here   Recursion

        System.out.println(findFactorial(6));
        
        System.out.println(findSum(12, 23, 34, 23));
    }
    
    public static int findFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * findFactorial(n - 1);
        
    }
    
    public static int findSum(int... num) {
        int sum = 0;
        for (int i : num) {
            sum += i;
        }
        
        return sum;
    }
    
}
