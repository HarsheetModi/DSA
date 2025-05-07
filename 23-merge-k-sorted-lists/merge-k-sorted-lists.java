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
    public ListNode mergeKLists(ListNode[] lists) {
        return partition(lists, 0, lists.length-1);
    }
    public ListNode partition(ListNode[] lists, int start, int end){
        if(start==end){
            return lists[start];
        }
        while(start<end){
            int mid = start + (end-start)/2;
            ListNode left = partition(lists, start, mid);
            ListNode right = partition(lists, mid+1, end);
            return merge(left, right);
        }
        return null;
    }
    public ListNode merge(ListNode l1, ListNode l2){
        ListNode temp = new ListNode(0);
        ListNode curr = temp;
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                curr.next = l1;
                curr = l1;
                l1 = l1.next;
            }
            else{
                curr.next = l2;
                curr = l2;
                l2 = l2.next;
            }
        }
        if(l1 != null){
            curr.next = l1;
        }
        else{
            curr.next = l2;
        }
        return temp.next;
    }



















    //     return partition(lists, 0, lists.length-1);
    // }
    // public ListNode partition(ListNode[] lists,int start,int end){
    //     if(start==end){
    //         return lists[start];
    //     }
        
    //     if(start<end){
    //         int mid =start + (end-start)/2;
    //         ListNode left = partition(lists, start, mid);
    //         ListNode right = partition(lists, mid+1, end);
    //         return merge(left, right);
    //     }
    //     return null;
    // }
    // public ListNode merge(ListNode l1, ListNode l2){
    //     ListNode temp = new ListNode(0);
    //     ListNode curr = temp;
    //     while(l1!=null && l2!=null){
    //         if(l1.val<l2.val){
    //             curr.next = l1;
    //             l1 = l1.next;
    //         }
    //         else{
    //             curr.next = l2;
    //             l2 = l2.next;
    //         }
    //         curr = curr.next;
    //     }
    //     curr.next = (l1 != null)? l1 :l2;
    //     return temp.next;
    }
