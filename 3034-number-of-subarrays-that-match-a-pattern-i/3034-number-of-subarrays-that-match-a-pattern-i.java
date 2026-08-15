class Solution {
    public int countMatchingSubarrays(int[] nums, int[] pattern) {
        int count=0;
        // i = starting index of the current subarray
        // pattern.length + 1 = size of the subarray
        // Example: pattern = [1,1] → subarray size = 3
        for(int i=0;i<=nums.length-(pattern.length+1);i++){
            //Assume the current subarray matches
            boolean match=true;
            // j checks each condition of the pattern
            // Example: pattern = [1,1]
            // j = 0 → check first pair
            // j = 1 → check second pair
            for(int j=0;j<pattern.length;j++){
                if(pattern[j]==1 && nums[i+j+1]<=nums[i+j]){
                    match=false; 
                }
                else if(pattern[j]==0 && nums[i+j+1]!=nums[i+j]){
                    match=false; 
                }
                else if(pattern[j]==-1 && nums[i+j+1]>=nums[i+j]){
                    match=false; 
                }
            }
            if(match){
                count++;
            }
        }
        return count;
    }
}