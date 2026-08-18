class Solution {
    public int largestInteger(int[] nums, int k) {
        int[] count = new int[51];
        // Check every subarray of size k
        for (int i = 0; i <= nums.length - k; i++) {
            boolean[] seen = new boolean[51];
            // Check elements inside the current window
            for (int j = i; j < i + k; j++) {
                // Count a number only once in each window
                if (!seen[nums[j]]) {
                    count[nums[j]]++;
                    seen[nums[j]] = true;
                }
            }
        }
        // Start from largest number
        for (int i = 50; i >= 0; i--) {
            // Appears in exactly one subarray
            if (count[i] == 1) {
                return i;
            }
        }
        return -1;
    }
}