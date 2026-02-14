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
    String ans = null;

    public String smallestFromLeaf(TreeNode root) {
        Path(root, "");
        return ans;
    }

    public void Path(TreeNode root, String path) {
        if(root == null)return;
        if (root.left == null && root.right == null) {
            path += (char) (root.val + 'a');
            path = new StringBuilder(path).reverse().toString();
            if (ans == null || path.compareTo(ans) < 0) {
                ans = path;
            }
        }
        if (root.left != null) {
            Path(root.left, path + (char) (root.val + 'a'));
        }
        if (root.right != null) {
            Path(root.right, path + (char) (root.val + 'a'));
        }
    }
}