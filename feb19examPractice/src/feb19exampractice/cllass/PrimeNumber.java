package feb19exampractice.cllass;

/**
 *
 * @author Admin
 */
public class PrimeNumber {

    public int n;

    public PrimeNumber() {
    }

    public PrimeNumber(int n) {
        this.n = n;
    }

    public void isItPrimeNumber() {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println(n + " is Prime Number");
        } else {
            System.out.println(n + " is not Prime Number");
        }
    }
}
