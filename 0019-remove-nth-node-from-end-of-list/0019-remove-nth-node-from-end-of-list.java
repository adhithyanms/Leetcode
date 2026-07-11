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
        int length = getLength(head);
        ListNode current = head;
        if(n==length)return head.next;
        length-=n;
        while(current!=null && length-->1){
            current = current.next;
        }
        current.next= current.next.next;
        return head;
    }
    public static int getLength(ListNode head){
        ListNode current = head;
        int count = 0;
        while(current!=null){
            count++;
            current = current.next;
        }
        return count;
    }
}