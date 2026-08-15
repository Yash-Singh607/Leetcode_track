class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder str=new StringBuilder();
        int k=0;
        for(int i=0;i<spaces.length;i++){
            str.append(s.substring(k,spaces[i])).append(" ");
            k=spaces[i];
            if(i==spaces.length-1){
                str.append(s.substring(k));
            }
        }
        return str.toString();
    }
}