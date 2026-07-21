class Solution {
    public boolean isSubsequence(String s, String t) {
        int m=0;
        int n=0;
        while(m <s.length() && n <t.length()){
            if(s.charAt(m)== t.charAt(n)){
                m++;
                n++;
            }
            else{
                n++;
            }
        }
        return m == s.length();
    }
}