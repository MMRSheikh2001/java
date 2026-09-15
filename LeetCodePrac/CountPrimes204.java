public class CountPrimes204 {
    public static void main(String[] args) {

    }
}

class Solution {
    public int countPrimes(int n) {
        int count = 0;

        for (int i = 2; i < n; i++) {

            int countb = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    countb++;

                }
            }

            if (countb == 2) {
                count++;
            }

        }
        return count;

    }
}