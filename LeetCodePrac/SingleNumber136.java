import java.util.HashSet;
import java.util.Set;

public class SingleNumber136 {
    public static void main(String[] args) {

    }
}

class Solution {
    public int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int target = 0;
        Set<Integer> set = new HashSet<>();
        Set<Integer> seb=new HashSet<>();
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    set.add(nums[i]);
                }
                
            }
            seb.add(nums[i]);
        }

        seb.add(nums[nums.length-1]);
        seb.removeAll(set);
        for(Integer i :seb){
            target=i;
        }
        return target;
    }
}