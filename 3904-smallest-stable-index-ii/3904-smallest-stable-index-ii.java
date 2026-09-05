class Solution {
    public int firstStableIndex(int[] nums, int k) {

        int n = nums.length;

        // min[i] = minimum from i to end
        int min[] = new int[n];
        min[n - 1] = nums[n - 1];

        // Build suffix minimum
        for (int i = n - 2; i >= 0; i--) {
            min[i] = Math.min(nums[i], min[i + 1]);
        }

        // max = maximum from 0 to i
        int max = nums[0];

        for (int i = 0; i < n; i++) {

            // Update prefix maximum
            max = Math.max(nums[i], max);

            // Stable if max - minimum suffix <= k
            if (max - min[i] <= k) {
                return i;
            }
        }

        return -1;
    }
}