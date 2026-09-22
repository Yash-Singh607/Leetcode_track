class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> list=new ArrayList<>();
        String str="";
        helper(s,0,str,list);
        return list;
        }
        public void helper(String s,int i,String ans,List<String> list){
        if(ans.length()==s.length()){
            list.add(ans);
            return;
        }
        char ch=s.charAt(i);
        if(Character.isLetter(ch)){
            helper(s,i+1,ans+Character.toLowerCase(ch),list);
            helper(s,i+1,ans+Character.toUpperCase(ch),list);
        }
        else{
            helper(s,i+1,ans+ch,list);
        }
    }
    }
    