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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans=new ListNode(0);
        ListNode head=ans;
        ListNode temp1=list1;
        ListNode temp2=list2;
        while(temp1!=null && temp2!=null){
            if(temp1.val<temp2.val){
                ans.next=new ListNode(temp1.val);
                temp1=temp1.next;
                ans=ans.next;
            }
            else{
                ans.next=new ListNode(temp2.val);
                temp2=temp2.next;
                ans=ans.next;
            }
        }
        while(temp1!=null){
            ans.next=new ListNode(temp1.val);
            temp1=temp1.next;
            ans=ans.next;
        }
        while(temp2!=null){
            ans.next=new ListNode(temp2.val);
            temp2=temp2.next;
            ans=ans.next;
        }
        return head.next;
    }
}