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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int length1 = getLength(l1);
        int length2 = getLength(l2);
        while(length1<length2){
            l1 = new ListNode(0,l1);
            length1++;
        }       
        while(length1>length2){
            l2 = new ListNode(0,l2);
            length2++;
        }   
        int carry[] = new int[1];    
        ListNode  result = addList(l1,l2,carry);
        if(carry[0]>0){
            result = new ListNode(carry[0],result);
        }
        return result;
    }
    public static int getLength(ListNode head){
        int count = 0;
        ListNode current = head;
        while(current!=null){
            current = current.next;
            count++;
        }
        return count;
    }

    public static ListNode addList(ListNode l1 , ListNode l2 , int[]carry){
        if(l1==null){
            return null;
        }
        ListNode head = addList(l1.next , l2.next , carry);
        int sum = l1.val+l2.val+carry[0];
        carry[0] = sum/10;
        return new ListNode(sum%10 , head);
    }
}