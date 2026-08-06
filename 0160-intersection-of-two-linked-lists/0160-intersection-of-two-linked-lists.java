public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = getLength(headA);
        int lenB = getLength(headB);
        ListNode p1 = headA;
        ListNode p2 = headB;
        // move pointer to longer list
        while (lenA > lenB) {
            p1 = p1.next;
            lenA--;
        }
        while (lenB > lenA) {
            p2 = p2.next;
            lenB--;
        }
        // move both pointer together
        while (p1 != null && p2 != null) {
            if (p1 == p2)
                return p1;

            p1 = p1.next;
            p2 = p2.next;
        }

        return null;
    }
    private int getLength(ListNode head) {
        int len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }
        return len;
    }
}