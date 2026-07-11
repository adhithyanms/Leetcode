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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        int length = 0;
        ListNode current = head;
        while (current != null) {
            current = current.next;
            length++;
        }
        ListNode dummy  = new ListNode(0);
        ListNode prev  = dummy;
        prev.next = head;
        while(length>=k){
            ListNode start = prev.next;
            prev.next = reverse(start , k);
            prev = start;
            length-=k;
        }
        return dummy.next;
    }
    public static ListNode reverse(ListNode head , int k){
        if(head == null || head.next == null){
            return head;
        }
        ListNode current = head , prev = null;
        while(( k-->0 ) && current!=null){
            ListNode newHead = current.next;
            current.next = prev;
            prev = current;
            current = newHead;
        }
        head.next = current;
        return prev;
    }
}