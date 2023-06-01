
import java.util.HashSet;
import java.util.Set;

class Solution6 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        for (int num : nums) {
            if (set.contains(num)) {
                return true; // Found a duplicate
            }
            
            set.add(num);
        }
        
        return false; // No duplicates found
    }
}

public class Test6 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1 };
        
        Solution6 solution = new Solution6();
        boolean result = solution.containsDuplicate(nums);
        
        System.out.println(result);
    }
}
