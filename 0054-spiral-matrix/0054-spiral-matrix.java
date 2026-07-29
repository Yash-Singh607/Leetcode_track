class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        List<Integer> ans= new ArrayList<>();
        int startrow=0,endrow=m-1;
        int startcol=0,endcol=n-1;
        // repeat the process until all elements are printed
        while(startrow<=endrow && startcol<=endcol){
            // top
            for(int j=startcol;j<=endcol;j++){
                ans.add(mat[startrow][j]);
            }
            // right
            for(int i=startrow+1;i<=endrow;i++){
                ans.add(mat[i][endcol]);
            }
            // bottom
            for(int j=endcol-1;j>=startcol;j--){
                // incase we have odd matrix you need not to add top and bottom elements two times so avoid duplicates we do this
                if(startrow==endrow){
                    break;
                }
                ans.add(mat[endrow][j]);
            }
            // left
            for(int i=endrow-1;i>=startrow+1;i--){
                // in case you have odd length matrix you need not to add left and right elements two times so avoid duplicates we do this
                if(startcol==endcol){
                    break;
                }
                ans.add(mat[i][startcol]);
            }
            // after printing the boundaries we go inside then we need to perform these operations
            startrow++;
            endrow--;
            startcol++;
            endcol--;
        }
        return ans;
    }
}