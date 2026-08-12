class Solution {
    public int pivotIndex(int[] nums) {
        int totalsum=0;
        for(int i: nums){
            totalsum=totalsum+i;
        }
        int suffixsum=0;
        for(int i=0;i<nums.length;i++){

            int prefixsum=totalsum-suffixsum-nums[i]; 
            if(prefixsum==suffixsum){
                return i;
            }
            suffixsum=suffixsum+nums[i];

        }
        return -1;
    }
}