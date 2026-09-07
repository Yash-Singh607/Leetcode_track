class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n=nums.length;
        Integer [] index=new Integer[n];
        for(int i=0;i<n;i++){
            index[i]=i;
        }
        Arrays.sort(index,(a,b)->nums[b]-nums[a]);
        int klargest=nums[index[k-1]];
        return klargest;
    }
}