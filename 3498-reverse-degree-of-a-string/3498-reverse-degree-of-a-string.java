class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            int prod=(123-s.charAt(i))*(i+1);
            sum=sum+prod;
        }
        return sum;
    }
}