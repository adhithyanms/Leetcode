/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q)return root;
        return lowestFather(root , p , q );
    }
    public TreeNode lowestFather(TreeNode root , TreeNode p , TreeNode q){
        if(root == null || root == p || root == q){
            return root;
        }
        TreeNode leftFather = lowestFather(root.left , p , q );
        TreeNode rightFather = lowestFather(root.right , p , q );
        if(leftFather == null){
            return rightFather;
        }
        if(rightFather == null){
            return leftFather;
        }
        return root;
    }
}