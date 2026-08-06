class Solution {
    public boolean isArraySpecial(int[] nums) {
        if(nums.length==1) return true;
        int n=nums.length-1;
        if(n>2 && ((nums[n-1]%2==0 && nums[n-2]%2==0) || (nums[n-1]%2!=0 && nums[n-2]%2!=0))){
            return false;
        }
        for(int i=1;i<nums.length;i++){
            if((nums[i-1]%2==0 && nums[i]%2==0 )|| (nums[i-1]%2!=0 && nums[i]%2!=0)) {
                return false;
            }
        }
        return true;
    }
}