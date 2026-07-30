class Solution {
    public int minimumPushes(String word) {
        // Each key can have one first-position letter ,So at most 8 letters cost 1
        //After filling the first position of every key ,the second letter on each key costs 2
        // formula to calculate the pushes we can say (i/8)+1 for eg i=9 pushes=(9/8)+1=2
        int n=word.length();
        int pushes=0;
        for(int i=0;i<n;i++){
            // 
            pushes+=(i/8)+1;
        }
        return pushes;
    }
}
// x y c d e f g h i j 
// 0 1 2 3 4 5 6 7 8 9
// 8*1+ 2*2=12