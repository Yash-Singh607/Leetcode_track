class Solution {
    public boolean stoneGameIX(int[] stones) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        // Count stones based on remainder
        for (int stone : stones) {
            if (stone % 3 == 0) {
                count0++;
            } else if (stone % 3 == 1) {
                count1++;
            } else {
                count2++;
            }
        }
        // No stone with remainder 1 or 2
        if (count1 == 0 && count2 == 0) {
            return false;
        }
        // Even number of remainder-0 stones
        if (count0 % 2 == 0) {
            return count1 > 0 && count2 > 0;
        }
        // Odd number of remainder-0 stones
        return Math.abs(count1 - count2) > 2;
    }
}
// count0 = number of values divisible by 3
// count1 = number with remainder 1
// count2 = number with remainder 2