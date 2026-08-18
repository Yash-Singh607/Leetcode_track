class Solution {
    public int captureForts(int[] forts) {
        int ans = 0;
        for (int i = 0; i < forts.length; i++) {
            // Start from our fort
            if (forts[i] == 1) {
                int j = i + 1;
                // Move through enemy forts
                while (j < forts.length && forts[j] == 0) {
                    j++;
                }
                // If we reach an empty position
                if (j < forts.length && forts[j] == -1) {
                    ans = Math.max(ans, j - i - 1);
                }
            }
            // Start from an empty position
            if (forts[i] == -1) {
                int j = i + 1;
                // Move through enemy forts
                while (j < forts.length && forts[j] == 0) {
                    j++;
                }
                // If we reach our fort
                if (j < forts.length && forts[j] == 1) {
                    ans = Math.max(ans, j - i - 1);
                }
            }
        }
        return ans;
    }
}