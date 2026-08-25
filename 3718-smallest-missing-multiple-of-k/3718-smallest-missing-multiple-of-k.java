class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int i=1;
        while(i<100){
            int num=i*k;
            if(!set.contains(num)){
                return num;
            }
            i++;
        }
        return nums.length+1;
    }
}