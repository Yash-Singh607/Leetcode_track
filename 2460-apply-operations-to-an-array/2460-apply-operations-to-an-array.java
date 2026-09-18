class Solution {
    public int[] applyOperations(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            if(i+1<nums.length && nums[i]==nums[i+1]){
                nums[i]=nums[i]*2;
                nums[i+1]=0;
                i++;
            }
        }
        int k=0;
        int l=0;
        while(l<nums.length ){
            if(nums[l]!=0){
                ans[k]=nums[l];
                k++;
            }
            l++;
        }
        return ans;
    }
}