public class DigitFrequencyScore3945 {
    public static void main(String[] args) {

    }
}

class Solution {
    public int digitFrequencyScore(int n) {
        int sum = 0;

        while (n != 0) {

            int rem = n % 10;
            sum += rem;
            n = n - rem;
            n = n / 10;
        }
        return sum;
    }
}