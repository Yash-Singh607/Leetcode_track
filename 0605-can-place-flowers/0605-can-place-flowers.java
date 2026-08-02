class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len= flowerbed.length;
        int count=0;
        for(int i=0;i<len;i++){
            // Check if current position is empty
            if(flowerbed[i]==0)
            // Check left side and right side
                if((i==0||flowerbed[i-1] == 0) && (i==len-1 || flowerbed[i+1] == 0)){
                    count++;
                    // Place flower
                    flowerbed[i]=1;
                }
            }
        // If enough flowers are placed
        if(count>=n){
            return true;
        }
        return false;
    }
}