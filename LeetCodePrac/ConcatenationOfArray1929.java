public class ConcatenationOfArray1929 {
    public static void main(String[] args) {

    }
}

class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] arr = new int[nums.length * 2];

        for (int i = 0; i < arr.length; i++) {
            if (i < nums.length) {

                arr[i] = nums[i];
            } else if (i >= nums.length) {
                arr[i] = nums[i - nums.length];
            }
        }
        return arr;
    }
}