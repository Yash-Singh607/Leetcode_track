class Solution {
    public String stoneGameIII(int[] stoneValue) {
        int n = stoneValue.length;
        int[] dp = new int[n + 1];
        dp[n] = 0;
        for (int i = n - 1; i >= 0; i--) {
            int take = 0;
            dp[i] = Integer.MIN_VALUE;
            // can choose 1or2or3 stones
            for (int k = 0; k < 3 && i + k < n; k++) {
                take += stoneValue[i + k];
                // calculating difference(advantage)
                dp[i] = Math.max(dp[i], take - dp[i + k + 1]);
            }
        }
        if (dp[0] > 0)
            return "Alice";
        else if (dp[0] < 0)
            return "Bob";
        else
            return "Tie";
    }
}