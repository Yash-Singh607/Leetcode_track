class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int left=0;
        int right=nums.length-1;
        long concat=0;
        while(left<right){
            String n=Integer.toString(nums[left])+Integer.toString(nums[right]);
            concat+=Long.parseLong(n);
            left++;
            right--;
        }
        if(left==right){
            concat+=nums[left];
        }
        return concat;
    }
}