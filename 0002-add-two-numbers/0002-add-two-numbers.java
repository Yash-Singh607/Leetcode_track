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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans=new ListNode(0);
        int sum=0;
        int carry=0;
        ListNode temp1=l1;
        ListNode temp2=l2;
        ListNode head=ans;
        while(temp1!=null && temp2!=null ){
            sum=temp1.val+temp2.val+carry;
            ans.next=new ListNode(sum%10);
            carry=sum/10;
            temp1=temp1.next;
            temp2=temp2.next;
            ans=ans.next;
        }
        // if my l1 is not empty
        while(temp1!=null){
            sum=temp1.val+carry;
            ans.next=new ListNode(sum%10);
            carry=sum/10;
            temp1=temp1.next;
            ans=ans.next;
        }
        // if my l2 is not empty 
        while(temp2!=null){
            sum=temp2.val+carry;
            ans.next=new ListNode(sum%10);
            carry=sum/10;
            temp2=temp2.next;
            ans=ans.next;
        }
        // carry is remaining at the last then
        if(carry>0){
            ans.next=new ListNode(carry);
        }
        return head.next;
    }
}