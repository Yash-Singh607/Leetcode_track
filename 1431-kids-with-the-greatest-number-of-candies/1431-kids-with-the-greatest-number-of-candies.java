class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list= new ArrayList<>();
        int sum=0;
        int max=0;
        for(int candy:candies){
            max=Math.max(max,candy);
        }
        for(int i=0;i<candies.length;i++){
            sum=candies[i]+extraCandies;
            if(sum>=max){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        return list;
    }
}