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
        if(head == null || head.next == null)return head;
        Set<Integer> set = new HashSet<>();
        for(int n : nums){
            set.add(n);
        }
        ListNode prev = null;
        while(head!=null && set.contains(head.val)){
            prev = head;
            head = head.next;
        }
        ListNode current = head;
        while(current!=null){
            if(set.contains(current.val)){
                prev.next = current.next;
            }else{
            prev = current;}
            current = current.next;
            
        }
        return head;
    }
}