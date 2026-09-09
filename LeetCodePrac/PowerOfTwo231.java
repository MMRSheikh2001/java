public class PowerOfTwo231 {
    public static void main(String[] args) {

    }

}

class Solution {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && Integer.bitCount(n) == 1;
    }
}