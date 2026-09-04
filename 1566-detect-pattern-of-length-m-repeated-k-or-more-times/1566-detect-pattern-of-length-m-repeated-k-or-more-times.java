class Solution {
    public boolean containsPattern(int[] arr, int m, int k) {
        // count = number of consecutive matching elements
        // that are m positions apart
        int count = 0;
        // We compare arr[i] with arr[i + m].
        // So i can go only until arr.length - m.
        for (int i = 0; i < arr.length - m; i++) {
            // If both elements are equal, it means
            // the pattern is continuing.
            // Example:
            // arr = [1, 2, 1, 2]
            // m = 2
            // arr[0] == arr[2]  → 1 == 1 ✓
            // arr[1] == arr[3]  → 2 == 2 ✓
            if (arr[i] == arr[i + m]) {
                // One more element matched
                count++;
                // A pattern of length m must repeat k times.
                // The first occurrence is our original pattern,
                // so we need to match it with the remaining k - 1
                // occurrences.
                // Each occurrence contains m elements.
                // Required matching elements = m * (k - 1)
                // Example:
                // m = 2, k = 3
                // [1,2] [1,2] [1,2]
                //   ↑      ↑
                //   └──────┘
                // We need:
                // 2 * (3 - 1) = 4 matching elements
                if (count == m * (k - 1)) {
                    return true;
                }
            }
            else {

                // The pattern is broken because
                // arr[i] != arr[i + m].
                // Therefore, start counting a new pattern
                // from the next position.
                count = 0;
            }
        }
        // No pattern was repeated k times consecutively
        return false;
    }
}