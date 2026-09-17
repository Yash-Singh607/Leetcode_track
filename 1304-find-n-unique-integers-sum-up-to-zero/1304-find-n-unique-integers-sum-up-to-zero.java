class Solution {
    public int[] sumZero(int n) {
        int [] ans=new int[n];
        int left=0;
        int right=n-1;
        int val=1;
        while(left<right){
            ans[left]=-val;
            ans[right]=val;
            left++;
            right--;
            val++;
        }
        return ans;
    }
}