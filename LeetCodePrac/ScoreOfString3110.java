public class ScoreOfString3110 {
    public static void main(String[] args) {

    }
}

class Solution {
    public int scoreOfString(String s) {
        int sum = 0;
        for (int i = 0; i < s.length() - 1; i++) {

            int numOne = (int) s.charAt(i);
            int numTwo = (int) s.charAt(i + 1);
            int div = Math.abs(numOne - numTwo);
            sum += div;
        }

        return  sum;

    }
}