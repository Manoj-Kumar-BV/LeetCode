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
        return pal(head);
    }

    private boolean pal(ListNode head){
        ListNode temp = head;
        List<Integer> arr = new ArrayList<>();
        while(temp != null){
            arr.add(temp.val);
            temp = temp.next;
        }
        return pali(arr); 
    }
    private boolean pali(List<Integer> arr){
        int left = 0;
        int right = arr.size()-1;

        while(left < right){
            if(arr.get(left) != arr.get(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}