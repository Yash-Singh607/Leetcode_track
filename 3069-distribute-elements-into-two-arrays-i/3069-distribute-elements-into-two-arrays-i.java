class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(nums[0]);
        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(nums[1]);
        for(int i=2;i<nums.length;i++){
            if(list1.get(list1.size()-1)>list2.get(list2.size()-1)){
                list1.add(nums[i]);
            }
            else{
                list2.add(nums[i]);
            }
        }
        list1.addAll(list2);
        for(int i=0;i<nums.length;i++){
            nums[i]=list1.get(i);
        }
        return nums;
    }
}