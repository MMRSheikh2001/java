public class MirrorDistance3783 {
    public static void main(String[] args) {

    }
}

class Solution {
    public int mirrorDistance(int n) {
        long reversed = 0;
        int original = n;
        while (n != 0) {
            int s = n % 10;
            n = n - s;
            n = n / 10;
            reversed = reversed * 10 + s;
        }

        return Math.abs((int) reversed - original);
    }
}