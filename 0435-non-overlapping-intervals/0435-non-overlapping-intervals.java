class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        int count = 0;
        int prev = 0;
        for (int i = 1; i < intervals.length; i++) {
            // Current interval overlaps with previous kept interval
            if (intervals[i][0] < intervals[prev][1]) {
                count++;
            } else {
                // Current interval does not overlap, so keep it
                prev = i;
            }
        }
        return count;
    }
}