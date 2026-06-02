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
    public ListNode swapNodes(ListNode head, int k) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode temp=head;
        ListNode value1=null;
        ListNode value2=null;
        int count=0;
        while(temp!=null){
            count++;
            if(count==k){
                value1=temp;
            }
            temp=temp.next;
        }
        temp=head;
        int target=count-k+1;
        count=0;
        while(temp!=null){
            count++;
            if(count==target){
                value2=temp;
            }
            temp=temp.next;
        }
        int swap=value1.val;
        value1.val=value2.val;
        value2.val=swap;
        return head;
    }
}