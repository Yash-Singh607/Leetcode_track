class Solution {
    public int maxAbsValExpr(int[] arr1, int[] arr2) {
        int answer = 0;
        int maxA = Integer.MIN_VALUE, minA = Integer.MAX_VALUE;
        int maxB = Integer.MIN_VALUE, minB = Integer.MAX_VALUE;
        int maxC = Integer.MIN_VALUE, minC = Integer.MAX_VALUE;
        int maxD = Integer.MIN_VALUE, minD = Integer.MAX_VALUE;
        for (int i = 0; i < arr1.length; i++) {
            /*
             * Original expression:
             * |arr1[i] - arr1[j]|
             * + |arr2[i] - arr2[j]|
             * + |i - j|
             * After removing absolute values, it becomes:
             * (arr1[i] ± arr2[i] ± i)-(arr1[j] ± arr2[j] ± j)
             * We don't need a separate j loop.
             * For:
             *     value[i] - value[j]
             * maximum difference = maximum value - minimum value.
             * Therefore:
             * - maxA/minA represent the best i/j for expression A
             * - maxB/minB represent the best i/j for expression B
             * - maxC/minC represent the best i/j for expression C
             * - maxD/minD represent the best i/j for expression D
             */
            // Four unique sign combinations
            int expressionA = arr1[i] + arr2[i] + i;
            int expressionB = arr1[i] + arr2[i] - i;
            int expressionC = arr1[i] - arr2[i] + i;
            int expressionD = arr1[i] - arr2[i] - i;
            // Instead of looping over j, store its minimum
            // and store the maximum value for i.
            maxA = Math.max(maxA, expressionA);
            minA = Math.min(minA, expressionA);
            maxB = Math.max(maxB, expressionB);
            minB = Math.min(minB, expressionB);
            maxC = Math.max(maxC, expressionC);
            minC = Math.min(minC, expressionC);
            maxD = Math.max(maxD, expressionD);
            minD = Math.min(minD, expressionD);
        }
        /*
         * j is no longer explicitly used.
         * maxExpression - minExpression
         * gives the maximum difference between any two indices i and j.
         */
        answer = Math.max(answer, maxA - minA);
        answer = Math.max(answer, maxB - minB);
        answer = Math.max(answer, maxC - minC);
        answer = Math.max(answer, maxD - minD);
        return answer;
    }
}