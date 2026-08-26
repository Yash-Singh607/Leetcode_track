class Solution {
    public int countHillValley(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            // Skip if current value is same as the previous value
            if (nums[i - 1] == nums[i]) {
                continue;
            }
            // Find the next different value to handle duplicates
            int next = i + 1;
            while (next < nums.length && nums[next] == nums[i]) {
                next++;
            }
            // No different value exists on the right
            if (next == nums.length) {
                break;
            }
            // Hill: left < current > right
            if (nums[i - 1] < nums[i] && nums[i] > nums[next]) {
                count++;
            }
            // Valley: left > current < right
            else if (nums[i - 1] > nums[i] && nums[i] < nums[next]) {
                count++;
            }
        }
        return count;
    }
}