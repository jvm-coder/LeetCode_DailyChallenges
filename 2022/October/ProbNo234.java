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
        int len = 0;
        if(head ==null || head.next == null)
            return true;
        
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode nxt = null;
        ListNode prev = null;
        while(slow != null) {
            nxt = slow.next;
            slow.next = prev;
            prev = slow;
            slow = nxt;
        }
        
        while(prev != null) {
            if(!(head.val == prev.val))
                return false;
            head = head.next;
            prev = prev.next;
        }
        
        return true;
    }
}
