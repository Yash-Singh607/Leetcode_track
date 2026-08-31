class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> st = new ArrayList<>();
        if (nums.length == 0) {
            return st;
        }
        int first = nums[0];
        int last = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == last + 1) {
                last = nums[i];
            }
            else {
                if (first == last) {
                    st.add("" + first);
                }
                else {
                    st.add(first + "->" + last);
                }

                first = nums[i];
                last = nums[i];
            }
        }
        if (first == last) {
            st.add("" + first);
        }
        else {
            st.add(first + "->" + last);
        }

        return st;
    }
}