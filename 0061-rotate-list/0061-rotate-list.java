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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null)return head;
        ListNode current=head;
        int size=0;
        while(current!=null)
        {
            size++;
            current=current.next;
        }
        k=k%size;
        while(k>=1)
        { ListNode tem=head;
          ListNode pre=null;
           while(tem.next!=null)
           {
            pre=tem;
            tem=tem.next;
           }
           tem.next=head;
           head=tem;
           pre.next=null;
           k--;
        }
        return head;
    }
}