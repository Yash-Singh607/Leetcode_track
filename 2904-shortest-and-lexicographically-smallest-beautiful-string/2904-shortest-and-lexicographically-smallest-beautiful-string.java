class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        // Stores the best answer found so far
        String bestSubstring = "";
        int n = s.length();
        // Try every possible starting position
        for (int start = 0; start < n; start++) {
            int oneCount = 0;
            StringBuilder currentSubstring = new StringBuilder();
            // Expand the substring from the current start position
            for (int end = start; end < n; end++) {
                currentSubstring.append(s.charAt(end));
                // Count the number of 1s in the current substring
                if (s.charAt(end) == '1') {
                    oneCount++;
                }
                // If there are more than k ones, this substring
                // and all longer substrings from this start are invalid
                if (oneCount > k) {
                    break;
                }
                // We found a valid substring containing exactly k ones
                if (oneCount == k) {
                    String candidate = currentSubstring.toString();
                    // Update the answer if:
                    // 1. We don't have an answer yet
                    // 2. This substring is shorter
                    // 3. Same length but lexicographically smaller
                    if (bestSubstring.isEmpty()|| candidate.length() < bestSubstring.length()|| (candidate.length() == bestSubstring.length()&& candidate.compareTo(bestSubstring) < 0)) {
                        bestSubstring = candidate;
                    }
                }
            }
        }
        return bestSubstring;
    }
}