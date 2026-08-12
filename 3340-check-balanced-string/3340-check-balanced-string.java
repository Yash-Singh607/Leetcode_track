class Solution {
    public boolean isBalanced(String num) {
        //int nums=Integer.parseInt(num);
        int sum=0;
        for(int i=0;i<num.length();i+=2){
            sum+=Character.getNumericValue(num.charAt(i));
        }
        int sum1=0;
        for(int i=1;i<num.length();i+=2){
            sum1+=Character.getNumericValue(num.charAt(i));
        }
        if(sum==sum1){
            return true;
        }
        else{
            return false;
        }
    }
}