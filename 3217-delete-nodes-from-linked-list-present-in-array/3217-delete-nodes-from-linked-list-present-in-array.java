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
    public ListNode modifiedList(int[] nums, ListNode head) {
        if(head==null || head.next==null)return head;
        Set<Integer> set =new HashSet<>();
        for(int n:nums)set.add(n);
        ListNode dummy=new ListNode(0);
        ListNode pre=dummy;
        while(head!=null)
        {
         if(!set.contains(head.val))
         {
            pre.next=head;
            pre=pre.next;
         }
        head=head.next;
        }
        pre.next=null;
        return dummy.next;
    }
}