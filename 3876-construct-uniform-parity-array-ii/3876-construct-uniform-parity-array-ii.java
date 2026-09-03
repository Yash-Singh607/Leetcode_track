class Solution {
    public boolean uniformArray(int[] nums1) {
        int min = Integer.MAX_VALUE;
        int oddcount = 0;
        for (int num : nums1) {
            // Find the minimum element in the array
            min = Math.min(min, num);
            // Count the number of odd elements
            if (num % 2 != 0) {
                oddcount++;
            }
        }
        // If minimum is odd, we can make the array uniform.
        // If there are no odd elements, the array is already uniform (all even).
        return min % 2 != 0 || oddcount == 0;
    }
}