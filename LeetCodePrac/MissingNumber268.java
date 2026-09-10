import java.util.Arrays;

public class MissingNumber268 {
    public static void main(String[] args) {

    }

}

class Solution {
    public int missingNumber(int[] nums) {

        int suma = 0;
        for (int i : nums) {
            suma += i;
        }

        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i <= nums.length; i++) {
            sum += i;
        }
        return sum - suma;
    }
}