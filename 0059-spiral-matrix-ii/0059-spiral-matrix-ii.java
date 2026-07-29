class Solution {
    public int[][] generateMatrix(int n) {
      int[][] mat=new int[n][n];
      int startrow=0,endrow=n-1;
      int startcol=0,endcol=n-1;
      int value=1;
      while(startrow<=endrow && startcol<=endcol){
        // top
        for(int j=startcol;j<=endcol;j++){
            mat[startrow][j]=value++;
        }
        // right
        for(int i=startrow+1;i<=endrow;i++){
            mat[i][endcol]=value++;
        }
        // bottom
        for(int j=endcol-1;j>=startcol;j--){
            // incase we have odd matrix you need not to add top and bottom elements two times so avoid duplicates we do this
            if(startrow==endrow){
                break;
            }
            mat[endrow][j]=value++;
        }
        // left
        for(int i=endrow-1;i>=startrow+1;i--){
            // in case you have odd length matrix you need not to add left and right elements two times so avoid duplicates we do this
            if(startcol==endcol){
                break;
            }
            mat[i][startcol]=value++;
        }
        startrow++;
        endrow--;
        startcol++;
        endcol--;
      }
      return mat;
    }
}