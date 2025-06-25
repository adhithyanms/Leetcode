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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        traversal(ans,root);
        return ans;
    }
    public static void traversal(List<Integer> ans,TreeNode root)
    {
       if (root==null) return;
       traversal(ans,root.left);
       ans.add(root.val);
       traversal(ans,root.right);
    }

}