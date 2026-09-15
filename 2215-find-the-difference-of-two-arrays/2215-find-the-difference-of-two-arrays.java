class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1=new HashSet<>();
        for(int num:nums1){
            set1.add(num);
        }
        HashSet<Integer> set2=new HashSet<>();
         for(int num:nums2){
            set2.add(num);
        }
          List<List<Integer>> list=new ArrayList<>();
         List<Integer> innerList1 = new ArrayList<>();
        for(int num:set1){
            if(!set2.contains(num)){
                innerList1.add(num);
            }
        }
        list.add(innerList1);
      
        List<Integer> innerList = new ArrayList<>();
        for(int num:set2){
            if(!set1.contains(num)){
                innerList.add(num);
            }
        }
        list.add(innerList);
        
        return list;
    }
}