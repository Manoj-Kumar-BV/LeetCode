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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int size = 0;

        while(temp != null){
            temp = temp.next;
            size++;
        }

        if(size == n){
            return head = head.next;
        }
        ListNode prev = head;
        int idx = 1;
        while(idx < size-n){
            prev = prev.next;
            idx++;
        }
        ListNode nodedel = prev.next;
        prev.next = prev.next.next;
        return head;
    }
}