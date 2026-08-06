class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs=new HashSet<>();
        for(int num: nums1){
            hs.add(num);
        }
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
            if(hs.contains(nums2[i])){
                a.add(nums2[i]);
                hs.remove(nums2[i]);
            }
        }
        int [] ans= new int[a.size()];
        for(int i=0;i<a.size();i++){
            ans[i]=a.get(i);
        }
        return ans;
    }
}