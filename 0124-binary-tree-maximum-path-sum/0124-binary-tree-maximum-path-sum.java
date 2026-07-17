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
    int maxPathSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        path(root);
        return maxPathSum;
    }
    public int path(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftSum = Math.max(path(root.left),0);
        int rightSum = Math.max(path(root.right),0);
        maxPathSum = Math.max(maxPathSum , leftSum+rightSum+root.val);
        return root.val+Math.max(leftSum , rightSum);
    }
}