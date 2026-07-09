class Solution {
    public int minInsertions(String s) {
        int left = 0;    // Number of unmatched '('
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                left++;
            } else {

                // Check whether this ')' forms a pair "))"
                if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
                    i++; // Consume the second ')'
                } else {
                    // Need one extra ')'
                    ans++;
                }

                if (left > 0) {
                    left--;
                } else {
                    // Need one '('
                    ans++;
                }
            }
        }

        // Each remaining '(' needs two ')'
        ans += left * 2;

        return ans;
    }
}