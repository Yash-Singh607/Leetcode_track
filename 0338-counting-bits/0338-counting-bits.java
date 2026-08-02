class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int previousNumber = i >> 1;

            // Check the last bit of i
            // If last bit is 1, add 1 otherwise add 0
            int lastBit = i & 1;
            // Count of 1's in i 
            // count of 1's in previous number + last bit
            ans[i] = ans[previousNumber] + lastBit;
        }

        return ans;
    }
}