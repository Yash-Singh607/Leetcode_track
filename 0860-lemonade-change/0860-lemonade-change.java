class Solution {

    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        for (int num : bills) {
            // Customer pays $5, no change needed
            if (num == 5) {
                five++;
            }
            // Customer pays $10, give $5 change
            else if (num == 10) {
                if (five == 0) {
                    return false;
                }
                five--;
                ten++;
            }
            // Customer pays $20, need $15 change
            else {
                // Prefer $10 + $5 to save $5 bills
                if (ten > 0 && five > 0) {
                    ten--;
                    five--;
                }
                // Otherwise use three $5 bills
                else if (five >= 3) {
                    five -= 3;
                }
                else {
                    return false;
                }
            }
        }
        return true;
    }
}