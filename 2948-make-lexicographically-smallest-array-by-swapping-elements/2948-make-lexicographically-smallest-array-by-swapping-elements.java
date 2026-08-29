import java.util.*;
class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int n = nums.length;
        // Store original indices
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }
        // Sort indices based on their values in nums
        // Example: nums = [5,1,3] → indices = [1,2,0]
        Arrays.sort(indices, (a, b) -> Integer.compare(nums[a], nums[b]));
        int[] result = new int[n];
        // Start of the current group
        int start = 0;
        while (start < n) {
            int end = start;
            // Keep elements in the same group if their difference <= limit
            // Since values are sorted, only adjacent values need to be checked
            while (end + 1 < n &&
                   nums[indices[end + 1]] - nums[indices[end]] <= limit) {
                end++;
            }
            // Store the original positions of this group
            ArrayList<Integer> positions = new ArrayList<>();
            for (int i = start; i <= end; i++) {
                positions.add(indices[i]);
            }
            // Sort positions so smaller values go to earlier positions
            Collections.sort(positions);
            // Values are already sorted because indices were sorted by nums
            for (int i = 0; i < positions.size(); i++) {
                result[positions.get(i)] = nums[indices[start + i]];
            }
            // Move to the next group
            start = end + 1;
        }
        return result;
    }
}