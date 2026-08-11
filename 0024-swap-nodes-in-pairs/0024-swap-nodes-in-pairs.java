/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode temp=head;
        ListNode current=head.next;
        ListNode newhead= current;
        //to connect previous pair to current pair
        ListNode prev=null;
        while(temp!=null && current!=null){
            ListNode dummy=current.next;
            // swap
            current.next=temp;
            temp.next=dummy;
            if(prev!=null){
                prev.next=current;
            }
            prev=temp;
            temp=dummy;;
            if(temp!=null){
                current=temp.next;
            }
        }
        return newhead;
    }
}