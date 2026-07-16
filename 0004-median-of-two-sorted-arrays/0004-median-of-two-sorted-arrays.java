class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        //i have merged the two array into merged int sorted manner 
        int[] merged = new int[m + n];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                merged[k] = nums1[i];
                i++;
            } else {
                merged[k] = nums2[j];
                j++;
            }
            k++;
        }
        while (i < m) {
            merged[k] = nums1[i];
            i++;
            k++;
        }
        while (j < n) {
            merged[k] = nums2[j];
            j++;
            k++;
        }
        // we are calculating total length to check if it is even or odd to apply median formula
        int totalLength = merged.length;
        if (totalLength % 2 != 0) {
            return (double) merged[totalLength / 2];
        } else {
            int mid1 = merged[(totalLength / 2) - 1];
            int mid2 = merged[totalLength / 2];
            return (mid1 + mid2) / 2.0;
        }
    }
}