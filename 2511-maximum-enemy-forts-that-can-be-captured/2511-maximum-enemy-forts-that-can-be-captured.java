class Solution {
    public int captureForts(int[] forts) {
        int last = -1; // Store the previous non-zero position
        int ans = 0;   // Store the maximum forts captured
        for (int i = 0; i < forts.length; i++) {
            // Skip enemy forts (0)
            if (forts[i] == 0) {
                continue;
            }
            // If current and previous forts are different (1 and -1)
            // then all elements between them are enemy forts
            else if (last != -1 && forts[last] != forts[i]) {
                // Count the enemy forts between the two positions
                ans = Math.max(ans, i - last - 1);
            }
            // Store the current non-zero position
            last = i;
        }
        return ans;
    }
}