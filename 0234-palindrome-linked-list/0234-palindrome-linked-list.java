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
    public boolean isPalindrome(ListNode head) {
        ListNode dummy=new ListNode(0);
        ListNode copy=dummy;
        ListNode temp=head;
        while(temp!=null){
            copy.next=new ListNode(temp.val);
            copy=copy.next;
            temp=temp.next;
        }
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        ListNode first=dummy.next;
        ListNode second=prev;
        while(first!=null && second!=null){
            if(first.val==second.val){
                first=first.next;
                second=second.next;
            }
            else{
                return false;
            }
        }
        return true;
    }
}