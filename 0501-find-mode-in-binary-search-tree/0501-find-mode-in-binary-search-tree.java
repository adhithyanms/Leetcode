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
    List<Integer> val = new ArrayList<>();
    int currentCount = 0, maxCount = 0, currentValue = 0;

    public int[] findMode(TreeNode root) {
        helper(root);
        return val.stream().mapToInt(Integer::intValue).toArray();
    }

    public void helper(TreeNode root) {
        if (root == null)
            return;
        helper(root.left);
        currentCount = (currentValue == root.val) ? currentCount + 1 : 1;
        if (currentCount > maxCount) {
            maxCount = currentCount;
            val.clear();
            val.add(root.val);
        } else if (currentCount == maxCount) {
            val.add(root.val);
        }
        currentValue = root.val;
        helper(root.right);
    }
}