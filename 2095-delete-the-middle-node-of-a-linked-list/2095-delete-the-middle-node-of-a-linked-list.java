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
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null)return null;
        int count = 0;
        ListNode current =head;
        while(current!=null){
            current=current.next;
            count++;
        }
        current = head;
        count/=2;
        while(current!=null && (count--)!=1){
            current=current.next;
        }
        current.next = current.next.next;
        return head;
    }
}