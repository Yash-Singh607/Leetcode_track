import java.util.*;
class Solution {
    public int compress(char[] chars) {
        int n=chars.length;
        int i=0;
        int idx=0;
        while(i<n){
            char ch=chars[i];
            int count=0;
            while(i<n && chars[i]==ch){
                count++;
                i++;
            }
            if(count==1){
                chars[idx]=ch;
                idx++;
            }
            else{
                chars[idx]=ch;
                idx++;
                String str=Integer.toString(count);
                for(char dig: str.toCharArray()){
                    chars[idx]=dig;
                    idx++;
                }
            }
        }
        return idx;
    }
}