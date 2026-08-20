class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length % groupSize!=0){
            return false;
        }
        Arrays.sort(hand);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:hand){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num:hand){
            if(map.get(num)==0){
                continue;
            }
            for(int j=0;j<groupSize;j++){
                int current=num+j;
                if(!map.containsKey(current)||map.get(current)==0){
                    return false;
                }
                map.put(current,map.get(current)-1);
            }
        }
        return true;
    }
}