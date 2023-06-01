import java.util.Arrays;

class Solution5 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; // Index for last element in nums1
        int j = n - 1; // Index for last element in nums2
        int k = m + n - 1; // Index for last position in merged array
        
        // Merge the arrays from right to left
        while (i >= 0 && j >= 0) {
            // Compare the elements at the current indices
            if (nums1[i] > nums2[j]) {
                // nums1[i] is greater, so place it in the merged array
                nums1[k] = nums1[i];
                i--;
            } else {
                // nums2[j] is greater or equal, so place it in the merged array
                nums1[k] = nums2[j];
                j--;
            }
            
            k--; // Move to the next position in the merged array
        }
        
        // If there are remaining elements in nums2, place them in the merged array
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}

public class Test5 {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int m = 3;
        int[] nums2 = { 2, 5, 6 };
        int n = 3;
        
        Solution5 solution = new Solution5();
        solution.merge(nums1, m, nums2, n);
        
        // Print the merged array
        System.out.println(Arrays.toString(nums1));
    }
}
