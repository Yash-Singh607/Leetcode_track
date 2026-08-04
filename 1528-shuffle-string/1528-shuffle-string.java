class Solution {
    public String restoreString(String s, int[] indices) {
        char []result=new char[s.length()];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int newindex=indices[i];
            result[newindex]=ch;
        }
        return  String.valueOf(result);
    }
    
}