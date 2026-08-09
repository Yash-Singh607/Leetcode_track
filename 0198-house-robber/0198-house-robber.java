class Solution {
    // Array to store the answer for each index
    int t[] = new int[101];
    int solve(int[] nums, int i, int n) {
        // If we have reached the end, there is no house left to rob
        if (i >= n) {
            return 0;
        }
        // If we have already calculated the answer for this index,
        // return it instead of calculating again
        if (t[i] != -1) {
            return t[i];
        }
        // Choice 1: Rob the current house
        // We must skip the next house, so move to i + 2
        int steal = nums[i] + solve(nums, i + 2, n);
        // Choice 2: Skip the current house
        // Move to the next house
        int skip = solve(nums, i + 1, n);
        // Take the choice that gives more money
        // Store the answer in t[i] for future use
        return t[i] = Math.max(steal, skip);
    }
    public int rob(int[] nums) {
        int n = nums.length;
        // Initially mark all positions as not calculated
        Arrays.fill(t, -1);
        // Start checking from the first house
        return solve(nums, 0, n);
    }
}