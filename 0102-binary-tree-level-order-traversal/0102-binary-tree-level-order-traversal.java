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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        List<List<Integer>> ans=new ArrayList<>();
        if(root ==null)return ans;
        queue.add(root);
        while(!queue.isEmpty())
        {
           int length=queue.size();
           List<Integer> tem=new ArrayList<>();
           for(int i=0;i<length;i++)
           {
            TreeNode current=queue.poll();
            tem.add(current.val);
            if(current.left!=null)queue.add(current.left);
            if(current.right!=null)queue.add(current.right);
           }
           ans.add(tem);
        }
        return ans;
    }
}