
import java.util.Arrays;

class Solution4 {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        // Iterate through the digits from right to left
        for (int i = n - 1; i >= 0; i--) {
            // Increment the current digit by one
            digits[i] += 1;
            
            // Check if there is a carry
            if (digits[i] < 10) {
                // No carry, so return the digits array as is
                return digits;
            }
            
            // Carry occurred, so set the current digit to 0 and continue to the next digit
            digits[i] = 0;
        }
        
        // If the loop finishes, it means there is a carry in the most significant digit
        // Create a new array with one additional digit and set the most significant digit to 1
        int[] result = new int[n + 1];
        result[0] = 1;
        
        return result;
    }
}

public class Test4{
    public static void main(String[] args) {
        int[] digits = { 1, 2, 3 };
        
        Solution4 solution = new Solution4();
        int[] result = solution.plusOne(digits);
        
        // Print the resulting array
        System.out.println(Arrays.toString(result));
    }
}

