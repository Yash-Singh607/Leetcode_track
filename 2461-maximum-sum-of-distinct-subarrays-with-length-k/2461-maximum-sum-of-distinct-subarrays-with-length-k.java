class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int left = 0;
        long maxsum = 0;
        long sum = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int right = 0; right < nums.length; right++) {
            // Remove elements until current element is not duplicate
            while (set.contains(nums[right])) {
                set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }
            // Add current element
            set.add(nums[right]);
            sum += nums[right];
            // Keep window size at most k
            while (right - left + 1 > k) {
                set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }
            // If window size is exactly k, update answer
            if (right - left + 1 == k) {
                maxsum = Math.max(maxsum, sum);
            }
        }
        return maxsum;
    }
}
// 1st while → remove duplicate
// 2nd while → maintain window size k