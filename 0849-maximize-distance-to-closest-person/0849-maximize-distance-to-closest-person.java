class Solution {
    public int maxDistToClosest(int[] seats) {
        int last=-1;
        int ans= 0;
        for(int i=0;i<seats.length;i++){
            if(seats[i]==1){
                if(last==-1){
                    ans=i;
                }
                else{
                    ans=Math.max(ans,(i-last)/2);
                }
                last=i;
            }
        }
        ans = Math.max(ans, seats.length - 1 - last);
        return ans;
    }
}
//First gap:   ans = i
//Middle gap:  ans = (i - last) / 2
//Last gap:    ans = seats.length - 1 - last