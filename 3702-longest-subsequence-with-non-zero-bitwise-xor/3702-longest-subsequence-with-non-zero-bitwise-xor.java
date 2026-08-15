class Solution {
    public int longestSubsequence(int[] nums) {
        int XOR = 0;
        for (int num : nums) {
            XOR = XOR ^ num;
        }
        if (XOR != 0) {
            return nums.length;
        }
        for (int num : nums) {
            if (num != 0) {
                return nums.length - 1;
            }
        }
        return 0;
    }
}