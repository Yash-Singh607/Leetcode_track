class Solution {
    public int[] countOppositeParity(int[] nums) {
        // count[0] = number of even elements seen on the right
        // count[1] = number of odd elements seen on the right
        int[] count = new int[2];
        int[] ans = new int[nums.length];
        // Traverse from right to left because we need
        // to count elements that come after the current index
        for (int i = nums.length - 1; i >= 0; i--) {
            // 0 = even, 1 = odd
            int parity = nums[i] % 2;
            // 1 - parity gives the opposite parity
            // If current is even (0), count odd (1)
            // If current is odd (1), count even (0)
            ans[i] = count[1 - parity];
            // Add the current number to its parity count
            count[parity]++;
        }
        return ans;
    }
}