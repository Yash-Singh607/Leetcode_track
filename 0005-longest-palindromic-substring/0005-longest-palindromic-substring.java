class Solution {
    public String longestPalindrome(String s) {
        // If string has 0 or 1 character, it is already a palindrome.
        if (s.length() <= 1) {
            return s;
        }
        // Store the longest palindrome found so far.
        String maxStr = s.substring(0, 1);
        // Consider every character as the center.
        for (int i = 0; i < s.length(); i++) {
            // Find longest odd-length palindrome (center = i)
            String odd = expandFromCenter(s, i, i);
            // Find longest even-length palindrome (center = i and i+1)
            String even = expandFromCenter(s, i, i + 1);
            // Update answer if odd palindrome is longer.
            if (odd.length() > maxStr.length()) {
                maxStr = odd;
            }
            // Update answer if even palindrome is longer.
            if (even.length() > maxStr.length()) {
                maxStr = even;
            }
        }
        return maxStr;
    }
    // Expands from the given center and returns the palindrome.
    private String expandFromCenter(String s, int left, int right) {
        // Keep expanding while:
        // 1. Indices are inside the string.
        // 2. Characters on both sides are equal.
        while (left >= 0 &&
               right < s.length() &&
               s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // After the loop, left and right are one step outside the palindrome.
        // So actual palindrome is from left+1 to right-1.
        return s.substring(left + 1, right);
    }
}