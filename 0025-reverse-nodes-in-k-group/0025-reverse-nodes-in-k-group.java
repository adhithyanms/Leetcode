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
        int length = 0;
        ListNode current = head;
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        prev.next = head;
        while(current!=null){
            current= current.next;
            length++;
        }
        while(length>=k){
            ListNode start = prev.next;
            prev.next = reverse(start,k);
            prev = start;
            length-=k;
        }
        return dummy.next;
    }
    public ListNode reverse(ListNode head , int k){
        ListNode current = head ;
        ListNode prev = null;
        while(k-->0){
            ListNode newNode = current.next;
            current.next = prev ;
            prev = current;
            current = newNode;
        }
        head.next = current;
        return prev;
    }
}