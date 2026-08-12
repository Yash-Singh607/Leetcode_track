class Solution {
    public int[] bestTower(int[][] towers, int[] center, int radius) {
        int bestQuality = -1;
        int[] ans = {-1, -1};
        // Check every tower
        for (int[] tower : towers) {
            int x = tower[0];
            int y = tower[1];
            int q = tower[2];
            // Calculate Manhattan distance from center
            int distance = Math.abs(x - center[0]) + Math.abs(y - center[1]);
            // Consider only reachable towers
            if (distance <= radius) {
                // Choose tower with higher quality
                if (q > bestQuality) {
                    bestQuality = q;
                    ans = new int[]{x, y};
                }
                // If quality is same, choose lexicographically smaller coordinate
                else if (q == bestQuality) {
                    if (x < ans[0] || (x == ans[0] && y < ans[1])) {
                        ans = new int[]{x, y};
                    }
                }
            }
        }

        return ans;
    }
}