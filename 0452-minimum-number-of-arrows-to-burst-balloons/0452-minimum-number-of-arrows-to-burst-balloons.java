import java.util.*;
class Solution {
    public int findMinArrowShots(int[][] points) {
        // Sort by end
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int arrows = 1;
        int arrowPosition = points[0][1];
        for (int[] balloon : points) {
            int start = balloon[0];
            // Need new arrow
            if (start > arrowPosition) {
                arrows++;
                arrowPosition = balloon[1];
            }
        }
        return arrows;
    }
}