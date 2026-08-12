class Solution {
    public int[] bestTower(int[][] towers, int[] center, int radius) {
        int bestquality=-1;
        int ans[] ={-1,-1};
        for(int [] tower:towers){
            int x=tower[0];
            int y=tower[1];
            int q=tower[2];
            int distance=Math.abs(x-center[0])+Math.abs(y-center[1]);
            if(distance<=radius){
                if(q>bestquality){
                    bestquality=q;
                    ans=new int[]{x,y};
                }
                // If quality is same, choose lexicographically smaller coordinate
                else if(q==bestquality){
                    if(x<ans[0]||(x==ans[0] && y<ans[1])){
                        ans=new int[]{x,y};
                    }
                }
            }
        }
        return ans;
    }
}