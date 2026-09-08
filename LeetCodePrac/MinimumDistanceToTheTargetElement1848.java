import java.util.ArrayList;
import java.util.List;

public class MinimumDistanceToTheTargetElement1848 {
    public static void main(String[] args) {

    }
}

class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        List<Integer> differences = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                differences.add(Math.abs(start - i));
                
            }
        }

        int min = differences.get(0);
        for (int i = 1; i < differences.size(); i++) {
            if (differences.get(i) < min) {
                min = differences.get(i);
            }

        }

        return min;

    }
}
