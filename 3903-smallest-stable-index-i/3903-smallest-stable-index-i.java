class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        // Check every index as a possible stable index
        for (int i = 0; i < n; i++) {
            // Initially consider nums[i] as both min and max
            int min = nums[i];
            int max = nums[i];
            // Find the maximum value in the left part [0 ... i-1]
            for (int j = 0; j < i; j++) {
                max = Math.max(max, nums[j]);
            }
            // Find the minimum value in the right part [i ... n-1]
            for (int j = i; j < n; j++) {
                min = Math.min(min, nums[j]);
            }
            // Index i is stable if the difference between
            // maximum on the left and minimum on the right is <= k
            if (max - min <= k) {
                return i;  // Return the first stable index
            }
        }
        // No stable index was found
        return -1;
    }
}