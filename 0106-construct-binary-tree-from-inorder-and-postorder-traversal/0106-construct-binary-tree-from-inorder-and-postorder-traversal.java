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
    int postOrderIndex;
    Map<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postOrderIndex = postorder.length - 1;
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return build(postorder, 0, postOrderIndex);
    }

    public TreeNode build(int[] postorder, int start, int end) {
        if (start > end) {
            return null;
        }
        int postOrderValue = postorder[postOrderIndex--];
        TreeNode root = new TreeNode(postOrderValue);
        int inOrderIndex = map.get(postOrderValue);
        root.right = build(postorder, inOrderIndex + 1, end);
        root.left = build(postorder, start, inOrderIndex - 1);
        return root;
    }

}