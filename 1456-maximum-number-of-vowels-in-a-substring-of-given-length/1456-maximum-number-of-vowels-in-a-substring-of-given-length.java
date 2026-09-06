class Solution {
    public int maxVowels(String s, int k) {
        int count = 0; // Vowels in current window
        int max = 0;   // Maximum vowels found
        // Count vowels in the first window of size k
        for(int i = 0; i < k; i++) {
            if(isVowel(s.charAt(i))) {
                count++;
            }
        }
        max = count;
        // Slide the window through the string
        for(int i = k; i < s.length(); i++) {
            // Add the new character entering the window
            if(isVowel(s.charAt(i))) {
                count++;
            }
            // Remove the old character leaving the window
            if(isVowel(s.charAt(i - k))) {
                count--;
            }
            // Update maximum vowel count
            max = Math.max(max, count);
        }
        return max;
    }

    // Check whether a character is a vowel
    public boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' ||
               c == 'o' || c == 'u';
    }
}