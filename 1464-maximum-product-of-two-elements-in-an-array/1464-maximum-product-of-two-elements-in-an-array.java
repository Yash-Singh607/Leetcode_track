class Solution {
    public int maxProduct(int[] nums) {
        int maximum=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int p=(nums[i]-1)*(nums[j]-1);
                if(p > maximum){
                    maximum=p;
                }
            }
        }
        return maximum;
    }
}