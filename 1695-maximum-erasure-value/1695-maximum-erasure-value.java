class Solution { 
    public int maximumUniqueSubarray(int[] nums) { 
        
        // Stores elements currently present in the window
        HashSet<Integer> set = new HashSet<>(); 
        // Left boundary of the sliding window
        int left = 0; 
        // Sum of elements inside the current window
        int sum = 0; 
        // Stores the maximum sum found so far
        int max = 0; 
        // Expand the window using right pointer
        for (int right = 0; right < nums.length; right++) { 
            // If duplicate is found, shrink the window
            // from the left until the duplicate is removed
            while (set.contains(nums[right])) { 
                set.remove(nums[left]); 
                sum -= nums[left]; 
                left++; 
            } 
            // Add the new unique element to the window
            set.add(nums[right]); 
            sum += nums[right]; 
            // Update maximum sum
            max = Math.max(max, sum); 
        } 
        return max; 
    } 
}

//       enters              leaves
//          ↓                   ↓
//  sum += nums[right]    sum -= nums[left]