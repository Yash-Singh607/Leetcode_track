class Solution {
    public int countHillValley(int[] nums) {
        int n = nums.length;
        int count = 0;
        int i = 0;
        int j = 1;
        while (j < n - 1) {
            // Skip duplicate values
            if (nums[j] == nums[j + 1]) {
                j++;
                continue;
            }
            // Check hill or valley
            if ((nums[j] > nums[i] && nums[j] > nums[j + 1]) ||
                (nums[j] < nums[i] && nums[j] < nums[j + 1])) {
                count++;
                i = j;
            }
            j++;
        }
        return count;
    }
}