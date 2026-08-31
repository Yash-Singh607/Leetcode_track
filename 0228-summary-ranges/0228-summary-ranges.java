class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> st = new ArrayList<>();
        // If array is empty, there is no range
        if (nums.length == 0) {
            return st;
        }
        // first = starting number of current range
        // last = ending number of current range
        int first = nums[0];
        int last = nums[0];
        for (int i = 1; i < nums.length; i++) {
            // If current number is exactly next to last,
            // it belongs to the same consecutive range
            if (nums[i] == last + 1) {
                last = nums[i];
            }
            else {
                // Consecutive range has ended
                // Only one number in the range
                if (first == last) {
                    st.add("" + first);
                }
                // Multiple consecutive numbers
                else {
                    st.add(first + "->" + last);
                }
                // Start a new range from current number
                first = nums[i];
                last = nums[i];
            }
        }
        // The last range is not added inside the loop
        // because there is no next number to cause a break
        if (first == last) {
            st.add("" + first);
        }
        else {
            st.add(first + "->" + last);
        }
        return st;
    }
}