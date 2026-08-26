class Solution {
    public int countHillValley(int[] nums) {
        int count=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                continue;
            }
            int next=i+1;
            while(next<nums.length&&nums[next]==nums[i]){
                next++;
            }
            if(next==nums.length){
                break;
            }
            if(nums[i-1]<nums[i]&& nums[i]>nums[next]){
                count++;
            }
            else if(nums[i-1]>nums[i]&&nums[i]<nums[next]){
                count++;
            }
        }
        return count;
    }
}