public class CheckGoodInteger3959 {
    public static void main(String[] args) {

    }
}

class Solution {
    public boolean checkGoodInteger(int n) {
        long digitSum = 0;
        long squareSum = 0;

        while (n != 0) {

            int mod = n % 10;
            digitSum += mod;
            squareSum = squareSum + mod * mod;

            n -= mod;
            n /= 10;
        }
        return squareSum - digitSum >= 50;

    }
}