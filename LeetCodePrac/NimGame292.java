public class NimGame292 {
    public static void main(String[] args) {

    }
}

class Solution {
    public boolean canWinNim(int n) {
        n = n % 4;

        return n == 1 || n == 2 || n == 3;
    }
}
