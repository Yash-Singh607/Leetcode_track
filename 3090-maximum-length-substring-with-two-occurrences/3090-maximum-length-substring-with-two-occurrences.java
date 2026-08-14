class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character,Integer> count=new HashMap<>();
        int i=0;
        int res=0;
        for(int j=0;j<s.length();j++){
            char c=s.charAt(j);
            count.put(c,count.getOrDefault(c,0)+1);
            while(count.get(c)>2){
                // decrease the window until count become less than 2
                //shrink the window
                char left=s.charAt(i);
                count.put(left,count.get(left)-1);
                i++;
            }
            // if not greater than 2 then store the maximum window size in res
            res=Math.max(res,j-i+1);
        }
        return res;
    }
}