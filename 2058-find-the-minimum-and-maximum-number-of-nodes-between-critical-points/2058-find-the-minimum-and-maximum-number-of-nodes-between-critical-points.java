class Solution {

    public int[] nodesBetweenCriticalPoints(ListNode head) {
        // Keep previous and current node
        // We need previous, current and next to check a critical point
        ListNode prev = head;
        ListNode curr = head.next;
        // Position of current node
        int pos = 1;
        // Position of first critical point
        int first = -1;
        // Position of previous critical point
        int last = -1;
        // Store minimum distance between critical points
        int min = Integer.MAX_VALUE;
        // Last node cannot be a critical point
        // because it does not have a next node
        while (curr.next != null) {
            // Current node is a critical point if:
            // 1. It is greater than both neighbours (local maximum)
            // OR
            // 2. It is smaller than both neighbours (local minimum)
            if ((curr.val > prev.val && curr.val > curr.next.val) ||
                (curr.val < prev.val && curr.val < curr.next.val)) {
                // Store the first critical point
                if (first == -1) {
                    first = pos;
                }
                // If this is not the first critical point,
                // find distance from the previous critical point
                if (last != -1) {
                    min = Math.min(min, pos - last);
                }
                // Current critical point becomes the previous one
                last = pos;
            }
            // Move forward in the linked list
            prev = curr;
            curr = curr.next;
            pos++;
        }
        // If there are fewer than 2 critical points(If there are zero OR only one critical point, return [-1,-1])
        // we cannot calculate any distance
        if (first == -1 || first == last) {
            return new int[]{-1, -1};
        }
        // Maximum distance is between first and last critical point
        int max = last - first;
        return new int[]{min, max};
    }
}