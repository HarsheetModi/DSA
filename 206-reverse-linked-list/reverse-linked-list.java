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
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next == null)
            return head;
        ListNode newhead = head;
        ListNode ahead = head.next;
        while(ahead.next !=null){
            ListNode ahead1 = ahead.next;
            ahead.next = newhead;
            newhead = ahead;
            ahead = ahead1;
        }
        ahead.next = newhead;
        head.next = null;
        head = ahead;
        return head;





















        // if(head==null || head.next==null){
        //     return head;
        // }
        // ListNode newHead=head;
        // ListNode ahead = newHead.next;
        // while(ahead.next!=null){
        //     ListNode ahead1 = ahead.next;
        //     ahead.next = newHead;
        //     newHead = ahead;
        //     ahead = ahead1;
        // }
        // ahead.next = newHead;
        // head.next = null;
        // head = ahead;
        // return head;
    }
}