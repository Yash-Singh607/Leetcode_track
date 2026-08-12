class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        // freq: tracks how many times each number currently appears INSIDE the window [left, right]
        HashMap<Integer, Integer> freq = new HashMap<>();
        int left = 0;   // left boundary of the sliding window
        int ans = 0;    // best (longest) valid window length found so far
        // Expand the window one element at a time using 'right'
        for (int right = 0; right < nums.length; right++) {
            int x = nums[right];  // the new element entering the window
            // Add x to the window and update its frequency count
            freq.put(x, freq.getOrDefault(x, 0) + 1);
            // If adding x caused its count to exceed k, the window is now INVALID.
            // Shrink from the left until x's count is back within the limit (<= k).
            // Note: only x could have just broken the rule — everything else
            // in the window was already valid before this step.
            while (freq.get(x) > k) {
                int y = nums[left];  // the element about to leave the window (may or may not be x)
                // Remove y from the window by decrementing its count
                freq.put(y, freq.get(y) - 1);
                left++;  // shrink the window from the left
            }
            // At this point, [left, right] is guaranteed to be a valid window
            // (no element appears more than k times)
            // Update the answer with the current valid window's size
            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
}