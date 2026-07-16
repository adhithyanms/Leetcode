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
    int ans = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null) return ans;
        sum(root.left , true);
        sum(root.right , false);
        return ans;
    }
    public void sum(TreeNode root , boolean isValid){
        if(root == null)return ;
        if(root.left == null && root.right == null && isValid){
            ans+=root.val;
        }
        sum(root.left , true);
        sum(root.right , false);
    }
}