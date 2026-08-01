class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num <= first) {
                first = num;          // smallest seen so far
            } else if (num <= second) {
                second = num;         // second smallest (greater than first)
            } else {
                return true;          // found a number greater than both ⇒ triplet exists
            }
        }
        return false;
    }
}