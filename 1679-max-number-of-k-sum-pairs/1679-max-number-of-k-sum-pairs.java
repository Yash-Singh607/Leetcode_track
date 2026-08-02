class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0;
        int left = 0;
        int right = nums.length - 1;
        while(left < right) {
            int sum = nums[left] + nums[right];
            if(sum == k) {
                // Found a valid pair, consume both elements
                count++;
                left++;
                right--;
            }
            else if(sum < k) {
                // Need a larger sum, move left pointer
                left++;
            }
            else {
                // Need a smaller sum, move right pointer
                right--;
            }
        }
        return count;
    }
}