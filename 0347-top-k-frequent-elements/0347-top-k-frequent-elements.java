class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int i:nums){
            freq.put(i,freq.getOrDefault(i,0)+1);
        }
        int arr[]=new int[k];
        int g=0;
        while(g<k){
            int max=0;
            int key=0;
            for(Map.Entry<Integer,Integer> e: freq.entrySet()){
                if(e.getValue()>max){
                    max=e.getValue();
                    key=e.getKey();
                }
            }
            arr[g]=key;
            freq.remove(key);
            g++;
        }
        return arr;
    }
}