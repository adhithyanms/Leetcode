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
    int preOrderIndex=0;
    Map<Integer,Integer> map =new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0;i<inorder.length;i++)map.put(inorder[i],i);
        return convert(preorder,0,preorder.length-1);
    }
    public TreeNode convert(int[] preorder ,int start,int end)
    {
        if(start>end)return null;
        int rootValue=preorder[preOrderIndex++];
        TreeNode root=new TreeNode(rootValue);
        int rootIndex=map.get(rootValue);
        root.left=convert(preorder,start,rootIndex-1);
        root.right=convert(preorder,rootIndex+1,end);
        return root;
    }
}