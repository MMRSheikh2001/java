import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ContainsDuplicateII219 {
    public static void main(String[] args) {

    }
}

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        List<Integer> map = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.contains(nums[i])) {
                int oldPosition = map.get(nums[i]);
                if (Math.abs(i - oldPosition) <= k) {
                    return true;
                }
            }
            map.add(nums[i]);
        }
        return false;
    }
}