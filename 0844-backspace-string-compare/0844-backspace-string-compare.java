class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder ans1=new StringBuilder();
        StringBuilder ans2=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch=='#'){
                if(ans1.length()>0){
                    ans1.deleteCharAt(ans1.length()-1);
                }
            }
            else{
                ans1.append(ch);
            }
        }
        for(char ch:t.toCharArray()){
            if(ch=='#'){
                if(ans2.length()>0){
                    ans2.deleteCharAt(ans2.length()-1);
                }
            }
            else{
                ans2.append(ch);
            }
        }
        return ans1.toString().equals(ans2.toString());

    }
}