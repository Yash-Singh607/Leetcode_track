import java.util.*;

class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        // Number of elements must be divisible by k
        if (nums.length % k != 0) {
            return false;
        }
        // Sort so we can always start from the smallest number
        Arrays.sort(nums);
        // Store frequency of each number
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        // Try to create groups starting from the smallest unused number
        for (int num : nums) {
            // This number has already been completely used
            if (map.get(num) == 0) {
                continue;
            }
            // Create k consecutive numbers
            for (int j = 0; j < k; j++) {
                int current = num + j;
                // Required number is missing
                if (!map.containsKey(current) || map.get(current) == 0) {
                    return false;
                }
                // Use this number
                map.put(current, map.get(current) - 1);
            }
        }
        return true;
    }
}