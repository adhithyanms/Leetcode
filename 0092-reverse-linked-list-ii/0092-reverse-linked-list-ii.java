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
        if(head==null || head.next==null || left==right)return head;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode pre=dummy;
        for(int i=1;i<left;i++)pre=pre.next;
        ListNode start=pre.next;
        ListNode ans=reverse(start,right-left+1);
        pre.next=ans;
        return dummy.next;
    }
    public ListNode reverse(ListNode head,int index )
    {  if(head==null || head.next==null)return head;
       ListNode current=head,pre=null;
       while((index-->0) && current!=null)
       {
         ListNode newNode =current.next;
         current.next=pre;
         pre=current;
         current=newNode;
       }
       head.next=current;
       return pre;
    }

}