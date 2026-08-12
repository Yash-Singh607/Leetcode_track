class Solution {
    public int[] countOppositeParity(int[] nums) {
        int k=0;
        int n=nums.length;
        int [] ans=new int[n];
        for(int i=0;i<n;i++){
            int x=nums[i];
            int count=0;
            if(x%2==0){
                for(int j=i+1;j<n;j++){
                    if(nums[j]%2!=0){
                        count++;
                    }
                }
            }
            else{
                for(int j=i+1;j<n;j++){
                    if(nums[j]%2==0){
                        count++;
                    }
                }
            }
            ans[k]=count;
            k++;
        }
        return ans;
    }
}