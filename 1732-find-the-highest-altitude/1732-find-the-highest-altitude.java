import java.util.*;
class Solution {
    public int largestAltitude(int[] gain) {
        int current=0;
        int m=0;
        for (int i: gain){
            current =current+i;
            m=Math.max(current,m);
        }
        return m;
    }
}