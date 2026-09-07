class Solution {
    public int[] decode(int[] encoded) {
        int n = encoded.length + 1;
        int[] perm = new int[n];
        // Find XOR of all numbers from 1 to n
        int all = 0;
        for(int i = 1; i <= n; i++) {
            all ^= i;
        }
        // Find perm[0]
        for(int i = 1; i < encoded.length; i += 2) {
            all ^= encoded[i];
        }
        perm[0] = all;
        // Find remaining elements
        for(int i = 0; i < encoded.length; i++) {
            perm[i + 1] = perm[i] ^ encoded[i];
        }
        return perm;
    }
}