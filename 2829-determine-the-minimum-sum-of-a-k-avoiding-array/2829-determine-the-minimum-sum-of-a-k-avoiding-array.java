class Solution {
    public int minimumSum(int n, int k) {
        HashSet<Integer> set=new HashSet<>();
        // initialize sum=0
        int sum=0;
        // start from num=1 and then increment one by one 
        int num=1;
        while(set.size()<n){
            // Check if num creates a pair whose sum is k
            // Example: k = 4, num = 3
            // k - num = 1
            // If 1 is already selected, 1 + 3 = 4
            if(!set.contains(k-num)){
                set.add(num);
                sum+=num;
            }
            num++;
        }
        return sum;
    }
}

