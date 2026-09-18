class Solution {
    public void moveZeroes(int[] nums) {
        int k=0;
        int l=0;
        while(l<nums.length && k<nums.length){
            if(nums[l]!=0){
                nums[k]=nums[l];
                k++;
            }
            l++;
        }
        while(k<nums.length){
            nums[k]=0;
            k++;
        }
    }
}