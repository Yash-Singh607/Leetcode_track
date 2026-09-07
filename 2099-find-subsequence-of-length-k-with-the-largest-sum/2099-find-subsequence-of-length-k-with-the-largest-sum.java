class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        Integer[] index = new Integer[nums.length];
        // Store indices
        for(int i = 0; i < nums.length; i++) {
            index[i] = i;
        }
        // Sort indices based on nums values
        Arrays.sort(index, (a, b) -> nums[b] - nums[a]);
        // Select k largest elements
        boolean[] selected = new boolean[nums.length];
        for(int i = 0; i < k; i++) {
            selected[index[i]] = true;
        }
        // Put selected elements in original order
        int[] ans = new int[k];
        int j = 0;
        for(int i = 0; i < nums.length; i++) {
            if(selected[i]) {
                ans[j++] = nums[i];
            }
        }
        return ans;
    }
}