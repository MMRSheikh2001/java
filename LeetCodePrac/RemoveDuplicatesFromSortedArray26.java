import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray26 {

    public static void main(String[] args) {

    }
}

class Solution {
    public int removeDuplicates(int[] nums) {

        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;

    }
}