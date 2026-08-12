class Solution {
    public int[] countOppositeParity(int[] nums) {
        int n = nums.length;
        int odd = 0;
        int even = 0;
        int[] ans = new int[n];
        // Traverse from right to left so that
        // odd and even store the counts of elements to the right
        for (int i = n - 1; i >= 0; i--) {
            // If current number is even,
            // we need the count of odd numbers after it
            if (nums[i] % 2 == 0) {
                ans[i] = odd;
                even++;
            } 
            // If current number is odd,
            // we need the count of even numbers after it
            else {
                ans[i] = even;
                odd++;
            }
        }
        return ans;
    }
}