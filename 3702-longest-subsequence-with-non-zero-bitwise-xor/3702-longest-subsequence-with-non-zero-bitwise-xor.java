class Solution {
    public int longestSubsequence(int[] nums) {
        int XOR = 0;
        // Find XOR of all elements
        for (int num : nums) {
            XOR = XOR ^ num;
        }
        // If XOR is non-zero, take all elements
        if (XOR != 0) {
            return nums.length;
        }
        // If XOR is zero, remove one non-zero element
        for (int num : nums) {
            if (num != 0) {
                return nums.length - 1;
            }
        }
        // All elements are zero
        return 0;
    }
}
/* XOR != 0 → answer is n
   XOR == 0 and there is a non-zero number → answer is n - 1
   All numbers are 0 → answer is 0
*/
