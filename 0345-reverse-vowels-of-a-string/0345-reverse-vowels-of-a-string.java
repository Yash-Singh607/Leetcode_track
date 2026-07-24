class Solution {
    public String reverseVowels(String s) {
        ArrayList<Character> list=new ArrayList<>();
        for(int j=0;j<s.length();j++){
            if(s.charAt(j)=='A'||s.charAt(j)=='a'||s.charAt(j)=='E'||s.charAt(j)=='e'||s.charAt(j)=='I'||s.charAt(j)=='i'||s.charAt(j)=='O'||s.charAt(j)=='o'||s.charAt(j)=='U'||s.charAt(j)=='u'){
                list.add(s.charAt(j));
            }
        }
        Collections.reverse(list);
        String ans="";
        int l=0;
        for(int j=0;j<s.length();j++){
            if(s.charAt(j)=='A'||s.charAt(j)=='a'||s.charAt(j)=='E'||s.charAt(j)=='e'||s.charAt(j)=='I'||s.charAt(j)=='i'||s.charAt(j)=='O'||s.charAt(j)=='o'||s.charAt(j)=='U'||s.charAt(j)=='u'){
                ans=ans+list.get(l);
                l++;
            }
            else{
                ans=ans+s.charAt(j);
            }
        }
        return ans;
    }
}