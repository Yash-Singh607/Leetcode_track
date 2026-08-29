class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int n=nums.length;
        Integer[] indices=new Integer[n];
        for(int i=0;i<nums.length;i++){
            indices[i]=i;
        }
        Arrays.sort(indices,(a,b)->Integer.compare(nums[a],nums[b]));
        int [] result=new int[n];
        int start=0;
        while(start<n){
            int end=start;
            while(end+1<n && nums[indices[end+1]]-nums[indices[end]]<=limit){
                end++;
            }
            ArrayList<Integer> pos=new ArrayList<>();
            for(int i=start;i<=end;i++){
                pos.add(indices[i]);
            }
            Collections.sort(pos);
            for(int i=0;i<pos.size();i++){
                result[pos.get(i)]=nums[indices[start+i]];
            }
            start=end+1;
        }
        return result;

    }
}