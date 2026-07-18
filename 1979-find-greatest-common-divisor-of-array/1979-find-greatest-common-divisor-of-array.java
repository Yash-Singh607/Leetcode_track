class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int s=nums[0];
        int g=nums[nums.length-1];
        return gcd(s,g);
    }
    int gcd(int a, int b){
        if(b==0){
            return a;
        }
        else{
            return gcd(b,a%b);
        }
        
    }
}