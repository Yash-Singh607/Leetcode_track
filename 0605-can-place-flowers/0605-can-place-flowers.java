class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        int count = 0;
        // Handle first position
        if (flowerbed[0] == 0 && (len == 1 || flowerbed[1] == 0)) {
            flowerbed[0] = 1;
            count++;
        }
        // Check middle positions
        for (int i = 1; i < len - 1; i++) {
            if (flowerbed[i] == 0 && 
                flowerbed[i - 1] == 0 && 
                flowerbed[i + 1] == 0) {

                count++;
                flowerbed[i] = 1;
            }
        }
        // Handle last position
        if (len > 1 && flowerbed[len - 1] == 0 && flowerbed[len - 2] == 0) {
            flowerbed[len - 1] = 1;
            count++;
        }
        return count >= n;
    }
}