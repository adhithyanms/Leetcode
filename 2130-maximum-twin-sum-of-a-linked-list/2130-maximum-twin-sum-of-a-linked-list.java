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
    public int pairSum(ListNode head) {
        int n = getSize(head);
        int ans[] = new int [n];
        int index=0;
        while(head!=null){
            ans[index++] = head.val;
            head = head.next;
        }
        int maxPairSum = Integer.MIN_VALUE;
        for(int i = 0;i<=(n/2)-1;i++){
            maxPairSum = Math.max(maxPairSum,ans[i]+ans[n-1-i]);
        }
        return maxPairSum;
    }
    public int getSize(ListNode head){
        int count = 0;
        ListNode current = head;
        while(current!=null){
            count++;
            current = current.next;
        }
        return count;
    }
}