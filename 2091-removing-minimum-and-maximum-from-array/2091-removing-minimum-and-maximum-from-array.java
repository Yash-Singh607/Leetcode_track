class Solution {

    public int minimumDeletions(int[] nums) {
        int minindex = 0;
        int maxindex = 0;
        int n = nums.length;
        // Find the index of minimum and maximum element
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[maxindex]) {
                maxindex = i;
            }
            if (nums[i] < nums[minindex]) {
                minindex = i;
            }
        }
        // left = smaller index, right = larger index
        int left = Math.min(maxindex, minindex);
        int right = Math.max(maxindex, minindex);
        // Remove both elements from the front
        int front = right + 1;
        // Remove both elements from the back
        int back = n - left;
        // Remove one element from each side
        int total = (left + 1) + (n - right);
        // Take the minimum of the three possibilities
        return Math.min(front, Math.min(back, total));
    }
}