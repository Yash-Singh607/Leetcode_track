class Solution {
    public int maxAbsValExpr(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int res = 0;
        int[][] sign = {
                { 1, 1 },
                { -1, 1 },
                { 1, -1 },
                { -1, -1 }
        };
        for (int[] s : sign) {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                int val = s[0] * arr1[i] + s[1] * arr2[i] + i;
                if (val > max)
                    max = val;
                if (val < min)
                    min = val;
            }
            res = Math.max(res, max - min);
        }
        return res;
    }
}