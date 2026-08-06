class Solution {
    public int smallestNumber(int n, int t) {
        int i=n;
        while(true){
            int num=i;
            int sod=1;
            while(num>0){
                int s=num%10;
                sod=sod*s;
                num=num/10;
            }
            if(sod%t==0){
                return i;
            }
            i++;
        }
    }
}