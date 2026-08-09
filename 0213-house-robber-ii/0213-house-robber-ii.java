class Solution {

    int[] t = new int[101];

    int solve(int[] nums, int i, int end) {
        // No houses left
        if (i > end) {
            return 0;
        }
        // Return already calculated answer
        if (t[i] != -1) {
            return t[i];
        }
        // Rob current house and skip next
        int steal = nums[i] + solve(nums, i + 2, end);
        // Skip current house
        int skip = solve(nums, i + 1, end);
        // Store the better choice
        return t[i] = Math.max(steal, skip);
    }
    public int rob(int[] nums) {
        int n = nums.length;
        // Only one house
        if (n == 1) {
            return nums[0];
        }
        // Case 1: Don't rob the first house
        Arrays.fill(t, -1);
        int case1 = solve(nums, 1, n - 1);
        // Case 2: Don't rob the last house
        Arrays.fill(t, -1);
        int case2 = solve(nums, 0, n - 2);
        // Choose the better case
        return Math.max(case1, case2);
    }
}