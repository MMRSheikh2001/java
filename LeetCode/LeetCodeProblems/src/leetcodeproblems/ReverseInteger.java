package leetcodeproblems;

public class ReverseInteger {

    public static void main(String[] args) {
        System.out.println(Solution.reverse(125));
    }
}

class Solution {

    public static int reverse(int x) {

        System.out.println(Integer.MAX_VALUE);

        long newNumber = 0;

        while (x != 0) {
            int remaineder = x % 10;

            newNumber = newNumber * 10 + remaineder;

            x = x - remaineder;
            x = x / 10;

        }

        if (newNumber > Integer.MAX_VALUE || newNumber < Integer.MIN_VALUE) {
            return 0;
        }
        System.out.println(newNumber);

        return (int) newNumber;
    }
}
