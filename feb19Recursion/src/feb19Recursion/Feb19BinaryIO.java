package feb19Recursion;

import java.io.FileOutputStream;

/**
 *
 * @author Admin
 */
public class Feb19BinaryIO {

    private static Object temp;

    public static void main(String[] args) {
        System.out.println(getFactorial(6));

    }

    public static long getFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * getFactorial(n - 1);
        }

    }

}
