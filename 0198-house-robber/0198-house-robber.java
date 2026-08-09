class Solution {
    public int rob(int[] nums) {
        // Money we could have before the previous house
        int before = 0;
        // Maximum money we can have so far
        int best = 0;
        // Visit each house one by one
        for (int money : nums) {
            // If we skip this house → best
            // If we rob this house → before + money
            // Choose whichever gives more money
            int current = Math.max(best, before + money);
            // For the next house,
            // current "best" becomes the value from before
            before = best;
            // Store the new maximum money
            best = current;
        }
        // Return the maximum money we can rob
        return best;
    }
}