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
    int min=Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
       if(root==null)return 0;
       minimum(root);
       return min;
    }
    public void minimum(TreeNode root)
    {
        if(root==null)return ;
        minimum(root.left);
        if(prev!=null)
        {
            min=Math.min(min,Math.abs(prev.val-root.val));
        }
        prev=root;
        minimum(root.right);
    }
}