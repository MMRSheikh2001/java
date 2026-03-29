/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classtestmarch29;

/**
 *
 * @author Admin
 */
public class RecursionPrac {
    
    public static void main(String[] args) {
        
        System.out.println(getFactorial(6));
    }
    
    public static int getFactorial(int n) {
        if (n == 0) {
            
            return 1;
        }
        return n * getFactorial(n - 1);
        
    }
    
}
