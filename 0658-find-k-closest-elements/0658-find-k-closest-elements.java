class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int left = 0;
        int right = arr.length - 1;
        // Keep removing until only k elements are left
        while (right - left + 1 > k) {
            // Check which end is farther from x
            if (Math.abs(arr[left] - x) > Math.abs(arr[right] - x)) {
                // Left element is farther, so remove it
                left++;
            } else {
                // Right element is farther or equally far, so remove it
                right--;
            }
        }
        // Add the remaining elements to the answer
        List<Integer> ans = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            ans.add(arr[i]);
        }
        return ans;
    }
}