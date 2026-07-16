class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        
        // 1. Create a new array to hold all combined elements
        int[] merged = new int[m + n];
        
        int i = 0; // Pointer for nums1
        int j = 0; // Pointer for nums2
        int k = 0; // Pointer for merged array
        
        // 2. Merge elements in sorted order
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
        
        // If there are remaining elements in nums1, copy them
        while (i < m) {
            merged[k] = nums1[i];
            i++;
            k++;
        }
        
        // If there are remaining elements in nums2, copy them
        while (j < n) {
            merged[k] = nums2[j];
            j++;
            k++;
        }
        
        // 3. Find the median using your exact math logic (fixed for 0-indexing)
        int totalLength = merged.length;
        
        if (totalLength % 2 != 0) {
            // Odd length: return the exact middle element
            return (double) merged[totalLength / 2];
        } else {
            // Even length: return average of the two middle elements
            int mid1 = merged[(totalLength / 2) - 1];
            int mid2 = merged[totalLength / 2];
            return (mid1 + mid2) / 2.0;
        }
    }
}