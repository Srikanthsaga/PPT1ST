
import java.util.Arrays;

class Solution8 {
    public int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        int n = nums.length;
        
        // Sort the array
        Arrays.sort(nums);
        
        int duplicate = -1;
        int missing = 1;
        
        // Iterate through the sorted array
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                // Found the duplicate number
                duplicate = nums[i];
            } else if (nums[i] > nums[i - 1] + 1) {
                // Found the missing number
                missing = nums[i - 1] + 1;
            }
        }
        
        // Handle the case where the missing number is at the end of the array
        if (nums[n - 1] != n) {
            missing = n;
        }
        
        result[0] = duplicate;
        result[1] = missing;
        
        return result;
    }
}

public class Test8 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 4 };
        
        Solution8 solution = new Solution8();
        int[] result = solution.findErrorNums(nums);
        
        // Print the result
        System.out.println(Arrays.toString(result));
    }
}
