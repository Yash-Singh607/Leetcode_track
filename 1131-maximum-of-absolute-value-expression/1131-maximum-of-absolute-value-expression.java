class Solution {
    public int maxAbsValExpr(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int result = 0;
        // |x| can be written as +x or -x, so try all 4 sign combinations
        int[][] signs = {
            {1, 1},
            {-1, 1},
            {1, -1},
            {-1, -1}
        };
        for (int[] sign : signs) {
            int maxValue = Integer.MIN_VALUE;
            int minValue = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                // Create one signed expression for the current index
                int value = sign[0] * arr1[i]
                          + sign[1] * arr2[i]
                          + i;
                // Store maximum and minimum to avoid looping over j
                maxValue = Math.max(maxValue, value);
                minValue = Math.min(minValue, value);
            }
            // max - min gives the maximum difference between any two indices
            // This replaces the O(n²) i,j pair checking
            result = Math.max(result, maxValue - minValue);
        }
        return result;
    }
}