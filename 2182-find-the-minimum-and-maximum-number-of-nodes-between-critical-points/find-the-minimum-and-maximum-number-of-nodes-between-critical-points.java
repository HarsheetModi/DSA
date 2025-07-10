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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] result = {-1,-1};

        if(head == null || head.next == null || head.next.next == null){
            return result;
        }
        List<Integer> vals = new ArrayList<>();
        int count = 1;
        ListNode prev = head;
        ListNode curr = head.next;
        ListNode next = curr.next;
        while(next != null){
            if(curr.val > prev.val && curr.val > next.val){
                vals.add(count);
            }
            else if(curr.val < prev.val && curr.val < next.val){
                vals.add(count);
            }
            prev = curr;
            curr = next;
            next = next.next;
            count++;
        }
        if (vals.size() < 2) return result;

        int min = Integer.MAX_VALUE;
        for(int i =1; i < vals.size(); i++){
            min = Math.min(min, vals.get(i)-vals.get(i-1));
        }
        int max = vals.get(vals.size()-1) - vals.get(0);
        result[1] = max;
        result[0] = min;
        return result;
    }
}