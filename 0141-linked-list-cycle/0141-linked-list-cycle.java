/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> has = new HashSet<>();
        while(head!=null){
            if(has.contains(head)){
                return true;
            }else{
                has.add(head);
            }
            head = head.next;
        }
        return false;
    }
}