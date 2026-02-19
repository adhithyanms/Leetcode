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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null){
            return ;
        }
        ListNode starting = head;
        ListNode middle = middle(head);
        ListNode secondHalf = reverse(middle.next);
        middle.next = null;
        ListNode firstHalf = head;
        while( secondHalf!=null){
            ListNode f1 = firstHalf.next;
            ListNode s1 = secondHalf.next;
            firstHalf.next = secondHalf;
            secondHalf.next = f1;
            firstHalf = f1;
            secondHalf = s1;
        }
    }
    public ListNode middle(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode head){
        if(head == null  || head.next == null){
            return head;
        }
        ListNode newNode = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;
    }
}