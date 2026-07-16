/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode list1 = headA;
        while(list1!=null){
            ListNode list2 = headB;
            while(list2!=null){
                if(list1==list2){
                    return list1;
                }
                list2 = list2.next;
            }
            list1 = list1.next;
        }
        return null;
    }
}