class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0; // Position where we will put the next valid element
        // j checks every element of the array
        for (int j = 0; j < nums.length; j++) {
            // First 2 elements are always allowed
            // After that, check if current element is different
            // from the element 2 positions behind
            if (i < 2 || nums[j] != nums[i - 2]) {
                // Put the valid element at position i
                nums[i] = nums[j];
                // Move i to the next position
                i++;
            }
        }
        // i represents the number of valid elements
        return i;
    }
}