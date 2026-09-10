import java.util.Arrays;

public class MinimumOperations3512 {
    public static void main(String[] args) {

    }
}

class Solution {
    public int minOperations(int[] nums, int k) {
        long sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return (int) sum % k;
    }
}