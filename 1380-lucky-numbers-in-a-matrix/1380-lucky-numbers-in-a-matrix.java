class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> maxcols=new ArrayList<Integer>();
        int m=matrix.length;
        int n=matrix[0].length;
        for(int cols=0;cols<n;cols++){
            int maxcol = Integer.MIN_VALUE;
            for(int row=0;row<m;row++){
                maxcol=Math.max(maxcol,matrix[row][cols]);
            }
            maxcols.add(maxcol);
        }
        List<Integer> minrow=new ArrayList<Integer>();
        for(int row=0;row<m;row++){
            int maxrow = Integer.MAX_VALUE;
            for(int cols=0;cols<n;cols++){
                maxrow=Math.min(maxrow,matrix[row][cols]);
            }
            minrow.add(maxrow);
        }
        List<Integer> ans=new ArrayList<Integer>();
        for(int row=0;row<m;row++){
            for(int cols=0;cols<n;cols++){
                if(matrix[row][cols]==minrow.get(row) && matrix[row][cols]==maxcols.get(cols)){
                    ans.add(matrix[row][cols]);
                }
            }
        }
        return ans;
    }
}