class Solution {
    public boolean search(int[][] mat, int target,int row){
        // we only need to know column now
        int n= mat[0].length;
        int left=0,right=n-1;
        while(left<=right){
            int mid=right+(left-right)/2;
            if(target==mat[row][mid]){
                return true;
            }
            else if(target>mat[row][mid]){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] mat, int target) {
       int m=mat.length;
       int n=mat[0].length;
       int srow=0,erow=m-1;
       while(srow<=erow){
        int midrow=erow+(srow-erow)/2;
        if(target>=mat[midrow][0] && target<= mat[midrow][n-1]){
            // found the correct row ,so now we would perform binary search on this row
            return search(mat,target,midrow);
        }
        else if(target>=mat[midrow][n-1]){
            srow=midrow+1;
        }
        else{
            erow=midrow-1;
        }
       }
       return false;
    }
}