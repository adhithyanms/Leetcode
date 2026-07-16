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
    public boolean isBalanced(TreeNode root) {
        return checker(root)!=-1;
    }
    public int checker(TreeNode root){
        if(root == null)return 0;
        int left = checker(root.left);
        int right = checker(root.right);
        if(left<0 || right<0 || Math.abs(right-left)>1){
            return -1;
        }
        return Math.max(left , right)+1;
    }
}