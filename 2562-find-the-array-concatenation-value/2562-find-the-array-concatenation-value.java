class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        long concat = 0;
        while (left < right) {
            // Convert both numbers to String and concatenate them
            String n = Integer.toString(nums[left])+ Integer.toString(nums[right]);
            // Convert the concatenated String back to long
            concat += Long.parseLong(n);
            left++;
            right--;
        }
        // If one middle element remains, add it directly
        if (left == right) {
            concat += nums[left];
        }
        return concat;
    }
}