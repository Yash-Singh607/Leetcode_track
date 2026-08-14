class Solution {
    public int maximumLengthSubstring(String s) {
        // Store the frequency (count) of each character
        Map<Character, Integer> count = new HashMap<>();
        // i = left pointer
        // res = maximum length found
        int i = 0, res = 0;
        // j = right pointer
        // Move j through the string
        for (int j = 0; j < s.length(); j++) {
            // Get the current character
            char c = s.charAt(j);
            // Increase the count of current character
            // If character is not present, start with 0
            count.put(c, count.getOrDefault(c, 0) + 1);
            // If current character appears more than 2 times,
            // move the left pointer to make the window valid
            while (count.get(c) > 2) {
                // Get the character at the left side
                char left = s.charAt(i);
                // Remove one occurrence of the left character
                count.put(left, count.get(left) - 1);
                // Move left pointer forward
                i++;
            }

            // Calculate current window length
            // j - i + 1 because both i and j are included
            // Keep the maximum length
            res = Math.max(res, j - i + 1);
        }

        // Return the longest valid substring length
        return res;
    }
}