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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || head.next == null || left == right){
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        for(int i = 1;i<left;i++){
            prev = prev.next;
        }
        ListNode start = prev.next;
        ListNode ans = reverse(start , right-left+1);
        prev.next = ans;
        return dummy.next;
    }
    public static ListNode reverse(ListNode head , int index){
        if(head == null || head.next == null)return head;
        ListNode current = head,prev = null;
        while((index-->0) && current!=null){
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        head.next = current;
        return prev;
    }
}