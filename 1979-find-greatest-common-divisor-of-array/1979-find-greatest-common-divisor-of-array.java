class Solution {
    public int findGCD(int[] nums) {
        // assume min and max element to first element
        int min = nums[0];
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            // minimum element
            if (nums[i] < min) {
                min = nums[i];
            }
            // maximum element
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return gcd(min, max);
    }
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}