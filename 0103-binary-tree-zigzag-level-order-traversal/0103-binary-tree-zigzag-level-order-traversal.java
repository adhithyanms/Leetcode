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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        int index = 0;
        queue.offer(root);
        while(!queue.isEmpty()){
            List<Integer> tem = new ArrayList<>();
            int size = queue.size();
            for(int i = 0;i<size;i++){
                TreeNode current = queue.poll();
                tem.add(current.val);
                if(current.left!=null){
                    queue.offer(current.left);
                }
                if(current.right!=null){
                    queue.offer(current.right);
                }
            }
            if(index%2==1){
                Collections.reverse(tem);
            }
            ans.add(tem);
            index++;
        }
        return ans;
    }
}