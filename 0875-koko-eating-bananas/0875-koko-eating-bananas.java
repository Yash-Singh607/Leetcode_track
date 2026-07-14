class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1, r = 0;
        for (int p : piles)
            r = Math.max(r, p);
        while (l <= r) {
            int k = l + (r - l) / 2;
            long hours = 0;
            for (int p : piles)
                hours += (p + (long)k - 1) / k;
            if (hours <= h)
                r = k-1;
            else
                l = k + 1;
        }
        return l;
    }
}