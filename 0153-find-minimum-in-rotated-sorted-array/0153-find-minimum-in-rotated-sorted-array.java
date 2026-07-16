class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            // if mid is greater then smaller element lie in right side so left=mid+1
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {// if not true theen smaller element lie in left side also we include mid because mid can be also smaallest element so right=mid
                right = mid;
            }
        }
        return nums[right];// here i can return either arr[right] or arr[left]
    }
}