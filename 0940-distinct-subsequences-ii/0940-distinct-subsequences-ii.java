class Solution {
    static final long MOD = 1000000007;
    public int distinctSubseqII(String s) {
        long[] dp = new long[26];
        for (char c : s.toCharArray()) {
            int i = c - 'a';
            long total = 1; // empty subsequence
            for (int j = 0; j < 26; j++) {
                total = (total + dp[j]) % MOD;
            }
            dp[i] = total;
        }
        long ans = 0;
        for (long x : dp) {
            ans = (ans + x) % MOD;
        }
        return (int) ans;
    }
}