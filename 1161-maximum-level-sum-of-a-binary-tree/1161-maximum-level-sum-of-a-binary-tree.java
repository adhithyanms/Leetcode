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
    public int maxLevelSum(TreeNode root) {
        int maxSumIndex=0,allSum=Integer.MIN_VALUE;
        if(root==null)return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int index=0;
        while(!queue.isEmpty()){
            index++;
            int size = queue.size();
            int currentSum=0;
            for(int i=0;i<size;i++){
                TreeNode current = queue.poll();
                currentSum+=current.val;
                if(current.left!=null)queue.add(current.left);
                if(current.right!=null)queue.add(current.right);
            }
        if(allSum<currentSum){
            allSum=currentSum;
            maxSumIndex=index;
        }
        }
    return maxSumIndex;
    }
}