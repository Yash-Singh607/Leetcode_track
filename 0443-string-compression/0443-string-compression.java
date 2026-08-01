import java.util.*;

class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int i = 0;
        int idx = 0;

        while (i < n) {
            // Store the current character
            char ch = chars[i];
            int count = 0;

            // Count how many times the current character occurs consecutively
            while (i < n && chars[i] == ch) {
                count++;
                i++;
            }

            // If count is 1, directly add the character without adding the count
            if (count == 1) {
                chars[idx] = ch;
                idx++;
            }

            // Otherwise, add the character followed by its count
            // Count can have multiple digits (e.g., 12), so add each digit separately
            else {
                chars[idx] = ch;
                idx++;

                String str = Integer.toString(count);

                for (char dig : str.toCharArray()) {
                    chars[idx] = dig;
                    idx++;
                }
            }
        }

        return idx;
    }
}