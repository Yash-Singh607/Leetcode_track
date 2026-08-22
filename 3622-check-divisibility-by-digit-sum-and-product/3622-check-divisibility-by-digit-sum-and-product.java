class Solution {
    public boolean checkDivisibility(int n) {
        int org1=n;
        int org=n;
        int sum=0;
        while(n!=0){
            int r=n%10;
            sum+=r;
            n=n/10;
        }
        int prod=1;
        while(org>0){
            int r=org%10;
            prod*=r;
            org=org/10;
        }
        int sod=sum+prod;
        if(org1%sod==0){
            return true;
        }
        else{
            return false;
        }
    }
}