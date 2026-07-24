class Solution {
    public String reverseWords(String s) {
        String [] str=s.trim().split("\\s+");
        String s1="";
        for(int i=str.length-1;i>=0;i--){
            s1=s1+str[i];
            if(i>0){
                s1=s1+" ";
            }
        }
        return s1;
    }
}