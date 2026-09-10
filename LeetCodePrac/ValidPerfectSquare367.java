public class ValidPerfectSquare367 {
    public static void main(String[] args) {

    }
}

class Solution {
    public boolean isPerfectSquare(int num) {
        for (long i = 0; i <= num; i++) {
            if (i * i == num) {
                return true;
            } else if (i * i > num) {
                return false;
            }
        }
        return false;
    }
}