class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0, maxLength = 0, zeroCount = 0;
        // Expand the window using right pointer
        for (int right = 0; right < nums.length; ++right) {
            // Count zeros in the current window
            if (nums[right] == 0) {
                zeroCount++;
            }
            // If zeros are more than k,
            // shrink the window from the left
            while (zeroCount > k) {
                // If the element being removed is 0,
                // decrease the zero count
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }
            // Update the maximum valid window length
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}