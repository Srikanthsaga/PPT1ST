
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a map to store the complement of each number and its index
        Map<Integer, Integer> complementMap = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int complement = target - num;
            
            // Check if the complement of the current number exists in the map
            if (complementMap.containsKey(num)) {
                // Return the indices of the two numbers that add up to the target
                return new int[] { complementMap.get(num), i };
            }
            
            // Add the current number and its index to the map
            complementMap.put(complement, i);
        }
        
        // If no solution is found, return an empty array or throw an exception
        return new int[0];
    }

	public int removeElement(int[] nums, int val) {
		// TODO Auto-generated method stub
		return 0;
	}
}

public class Test1 {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        
        Solution solution = new Solution();
        int[] result = solution.twoSum(nums, target);
        
        // Print the indices of the two numbers that add up to the target
        for (int index : result) {
            System.out.print(index + " ");
        }
    }
}
