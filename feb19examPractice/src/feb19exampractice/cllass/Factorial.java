/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package feb19exampractice.cllass;

/**
 *
 * @author Admin
 */
public class Factorial {

    public int n;

    public Factorial() {
    }

    public Factorial(int n) {
        this.n = n;
    }

    public long getFactorial() {
        int multi = 1;
        if (n == 0) {
            return 1;
        } else {
            for (int i = 1; i <= n; i++) {
                multi = multi * i;

            }
            return multi;
        }
    }
}
