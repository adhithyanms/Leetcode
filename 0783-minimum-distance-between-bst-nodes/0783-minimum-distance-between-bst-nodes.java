/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    TreeNode prev=null;
    int minValue=Integer.MAX_VALUE;
    public int minDiffInBST(TreeNode root) {
        if(root==null)return 0;
        minDiffInBST(root.left);
        if(prev!=null){
            minValue=Math.min(minValue,Math.abs(prev.val-root.val));
        }
        prev=root;
        minDiffInBST(root.right);
        return minValue;
    }
}