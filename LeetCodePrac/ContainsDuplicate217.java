import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate217 {
    public static void main(String[] args) {
        
    }
    
}


class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> newSet=new  HashSet<>();
        for(int i=0;i<nums.length;i++){
            newSet.add(nums[i]);
        }

        return !(newSet.size()==nums.length);
    }
}