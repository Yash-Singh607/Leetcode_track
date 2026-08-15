class Solution {
    // sliding window is good for this 
    public int beautySum(String s) {
        int ans = 0;
        // Try every starting position
        for (int i = 0; i < s.length(); i++) {
            int[] freq = new int[26];
            // Expand the substring one character at a time
            for (int j = i; j < s.length(); j++) {
                freq[s.charAt(j) - 'a']++;
                int min = Integer.MAX_VALUE;
                int max = Integer.MIN_VALUE;
                // Find minimum and maximum frequency
                for (int k = 0; k < freq.length; k++) {
                    if (freq[k] > 0) {
                        min = Math.min(min, freq[k]);
                        max = Math.max(max, freq[k]);
                    }
                }
                // Beauty = max frequency - min frequency
                ans += (max - min);
            }
        }
        return ans;
    }
}