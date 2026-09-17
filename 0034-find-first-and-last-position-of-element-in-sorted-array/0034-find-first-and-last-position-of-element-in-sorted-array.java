class Solution {
    public int[] searchRange(int[] nums, int target) {
        int firstocc=findfirst(nums,target);
        if(firstocc==-1){
            return new int[]{-1,-1};
        }
        int lastocc=findlast(nums,target);
        return new int[]{firstocc,lastocc};
    }
    public static int findfirst(int[] nums,int target){
        int first=-1;
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                first=mid;
                high=mid-1;
            }
            else if (nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return first;
    }
    public static int findlast(int[] nums,int target){
        int last=-1;
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                last=mid;
                low=mid+1;
            }
            else if (nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return last;
    }
}