public class HappyNumber202 {
    public static void main(String[] args) {

    }

}

class Solution {
    public boolean isHappy(int n) {

        String num = n + "";
        if (n == 1 || n == 7) {
            return true;
        }
        if (n != 1 && n < 10) {
            return false;
        }

        while (num.length() != 1) {

            n = 0;

            for (int i = 0; i < num.length(); i++) {
                n = n + (int) Math.pow((Integer.parseInt(num.charAt(i) + "")), 2);
            }
            num = n + "";
            num = num.trim();

        }
        if (n == 1 || n == 7) {
            return true;
        }
        if (n != 1 && n < 10) {
            return false;
        }
        return true;
    }
}
