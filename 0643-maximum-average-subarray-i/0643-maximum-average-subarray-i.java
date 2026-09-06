class Solution {
    public double findMaxAverage(int[] nums, int k) {
       int left=0;
        double l=Double.NEGATIVE_INFINITY;
        int sum=0;
       for(int right=0;right<nums.length;right++){
        sum+=nums[right];
        if(right-left+1>k){
            sum-=nums[left];
            left++;
        }
        if(right-left+1==k){
            double avg=(double)sum/k;
            l=Math.max(avg,l);
        }
       }
       return l;
    }
}