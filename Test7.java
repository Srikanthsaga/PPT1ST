
class Solution7 {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int insertPos = 0; // Position to insert non-zero elements
        
        // Iterate through the array
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                // If the current element is non-zero, move it to the insert position
                nums[insertPos] = nums[i];
                
                // Increment the insert position
                insertPos++;
            }
        }
        
        // Fill the remaining positions from the insert position with zeros
        while (insertPos < n) {
            nums[insertPos] = 0;
            insertPos++;
        }
    }
}

public class Test7 {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 0, 3, 12 };
        
        Solution7 solution = new Solution7();
        solution.moveZeroes(nums);
        
        // Print the modified array
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
