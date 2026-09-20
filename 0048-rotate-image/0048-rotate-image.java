class Solution {
    public void rotate(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int [] a:matrix){
            int left=0;
            int right=a.length-1;
            while(left<right){
                int temp=a[left];
                a[left]=a[right];
                a[right]=temp;
                left++;
                right--;
            }
        }
    }
}