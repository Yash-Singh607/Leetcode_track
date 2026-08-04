class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> missing=new ArrayList<>();
        Arrays.sort(nums);
        int j=0;
        int n=nums[nums.length-1];
        for(int i=nums[0];i<n;i++){
            if(j<nums.length && nums[j]==i){
                j++;
            }else{
                missing.add(i);
            }
        }
        return missing;
    }
}