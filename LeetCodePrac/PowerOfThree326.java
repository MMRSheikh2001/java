public class PowerOfThree326 {
    public static void main(String[] args) {

    }
}

class Solution {
    public boolean isPowerOfThree(int n) {

        return n > 0 && Math.pow(3, 19) % n == 0;

    }
}