class Solution {
    public int[] shuffle(int[] nums, int n) {
        int nu=nums.length;
        int[] arr1=Arrays.copyOf(nums,n);
        int[] arr2=Arrays.copyOfRange(nums,n,nu);
        int[] ans=new int[nu];
        int i=0;
        int j=0;
        int k=0;
        while(i<nu && j<nu && k<nu){
            ans[k]=arr1[i];
            k++;
            ans[k]=arr2[j];
            i++;
            j++;
            k++;
        }
        return ans;
    }
}