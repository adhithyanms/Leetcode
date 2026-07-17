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
    public boolean isValidBST(TreeNode root) {
        TreeNode current = root;
        Stack<TreeNode> stack = new Stack<>();
        int currentVal = Integer.MIN_VALUE;
        boolean isFirst = false;
        while(current!=null || !stack.isEmpty()){
            while(current!=null){
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            if(currentVal<current.val || isFirst == false){
                isFirst = true;
                currentVal = current.val;
            }else{
                return false;
            }
            current = current.right;
        }
        return true;
    }
}