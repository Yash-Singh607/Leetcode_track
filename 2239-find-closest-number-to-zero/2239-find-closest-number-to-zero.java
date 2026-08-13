class Solution {
    public int findClosestNumber(int[] nums) {
        int min = Integer.MAX_VALUE;
        int ans = 0;
        for (int num : nums) {
            int n = Math.abs(num);
            if (n < min || (n == min && num > ans)) {
                min = n;
                ans = num;
            }
        }

        return ans;
    }
}