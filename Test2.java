
class Solution2 {
    public int removeElement(int[] nums, int val) {
        int k = 0; // Counter for elements not equal to val

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Check if the current element is not equal to val
            if (nums[i] != val) {
                // Assign the current element to the k-th position and increment k
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}

public class Test2 {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 2, 3 };
        int val = 3;

        Solution2 solution = new Solution2();
        int k = solution.removeElement(nums, val);

        // Print the number of elements remaining after removal
        System.out.println(k);

        // Print the updated nums array (only the first k elements matter)
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
