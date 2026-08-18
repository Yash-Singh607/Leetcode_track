class Solution {
    public int largestInteger(int[] nums, int k) {
        int[] count = new int[51];
        // Check every window of size k
        for (int start = 0; start <= nums.length - k; start++) {
            boolean[] seen = new boolean[51];
            // Find the end of the current window
            int end = start + k - 1;
            // Check all elements in this window
            for (int j = start; j <= end; j++) {
                // Count a number only once in each window
                if (!seen[nums[j]]) {
                    count[nums[j]]++;
                    seen[nums[j]] = true;
                }
            }
        }
        // Find the largest number that appears in exactly one window
        int ans = -1;
        for (int num = 0; num <= 50; num++) {
            if (count[num] == 1) {
                ans = num;
            }
        }
        return ans;
    }
}