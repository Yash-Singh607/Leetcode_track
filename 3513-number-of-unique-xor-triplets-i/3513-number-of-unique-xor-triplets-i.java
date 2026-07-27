class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;
        if (n < 3) {
            return n;
        }
        int k = Integer.toBinaryString(n).length();
        return 1 << k;
    }
}