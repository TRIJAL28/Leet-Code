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
    public ListNode oddEvenList(ListNode head) {
        // ListNode temp=head;
        // ListNode evendummy=new ListNode(-1);
        // ListNode odddummy=new ListNode(-1);
        // ListNode evenList=evendummy;
        // ListNode oddList=odddummy;
        // int count=0;
        // while(temp!=null){
        //     count++;
        //     if(count%2==0){
        //         evenList.next=new ListNode(temp.val);
        //         evenList=evenList.next;
        //     }
        //     else{
        //         oddList.next=new ListNode(temp.val);
        //         oddList=oddList.next;
        //     }
        //     temp=temp.next;
        // }
        // oddList.next=evendummy.next;
        // return odddummy.next;
        if (head == null || head.next == null) {
            return head;
        }
        ListNode odd=head;
        ListNode evenHead=head.next;
        ListNode even=evenHead;
        while(even!=null && even.next!=null){
            odd.next=odd.next.next;
            odd=odd.next;
            even.next=even.next.next;
            even=even.next;
        }
        odd.next=evenHead;
        return head;
    }
}