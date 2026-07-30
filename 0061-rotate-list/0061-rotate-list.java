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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }
        int count=1;
        ListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
            count++;
        }
        k=k%count;
        while(k>0){
            temp=head;
            while(temp.next.next!=null){
              temp=temp.next;
            }
            ListNode last=temp.next;
            // ListNode prev=temp;
            last.next=head;
            head=last;
            // head=temp.next;
            temp.next=null;
            k--;
        }
        return head;
    }
}