class Solution {
// i added comments for future undersstanding
    // Memoization array: t[i] stores the maximum money
    // we can rob starting from house i
    int[] t = new int[101];

    int solve(int[] nums, int i, int end) {

        // We have crossed the allowed range, so no house is left
        if (i > end) {
            return 0;
        }

        // If this index is already solved, reuse the stored answer
        if (t[i] != -1) {
            return t[i];
        }

        // Choice 1: Rob current house, so skip the next house
        int steal = nums[i] + solve(nums, i + 2, end);

        // Choice 2: Skip current house and move to the next house
        int skip = solve(nums, i + 1, end);

        // Store the better choice for this index
        return t[i] = Math.max(steal, skip);
    }

    public int rob(int[] nums) {

        int n = nums.length;

        // If there is only one house, simply rob it
        if (n == 1) {
            return nums[0];
        }
        /*
         * Houses are in a CIRCLE, so first and last houses are adjacent.
         * Therefore, we cannot rob both first and last.
         *
         * Case 1: Don't rob the first house
         *         Solve houses from index 1 to n-1
         */
        Arrays.fill(t, -1);
        int case1 = solve(nums, 1, n - 1);

        /*
         * Case 2: Don't rob the last house
         *         Solve houses from index 0 to n-2
         */
        Arrays.fill(t, -1);
        int case2 = solve(nums, 0, n - 2);

        // Take the better answer from the two cases
        return Math.max(case1, case2);
    }
}