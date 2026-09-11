public class FibonacciNumber509 {
    public static void main(String[] args) {

    }
}

class Solution {
    public int fib(int n) {
        int a = 0;
        int b = 1;
        if (n == 0) {
            return a;
        } else if (n == 1) {
            return b;
        }

        int c = a + b;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a=b;
            b=c;

        }
        return c;

    }
}