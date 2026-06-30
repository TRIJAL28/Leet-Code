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
        ListNode dummy_node=new ListNode(-1);
        ListNode dummy=dummy_node;
        ListNode temp=head;
        while(temp!=null){
            dummy.next=new ListNode(temp.val);
            dummy=dummy.next;
            temp=temp.next;
        }
        ListNode prev=null;
        temp=head;
        while(temp!=null){
            ListNode next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        ListNode first=dummy_node.next;
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