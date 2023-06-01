
class Solution3 {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        // If the loop finishes, the target was not found
        // Return the index where it would be inserted in order
        return left;
    }
}

public class Test3 {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 5, 6 };
        int target = 5;
        
        Solution3 solution = new Solution3();
        int index = solution.searchInsert(nums, target);
        
        System.out.println(index);
    }
}
