/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder serialize = new StringBuilder();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode current = queue.poll();
            if(current==null){
                serialize.append("null ");
                continue;
            }
            serialize.append(current.val+" ");
            queue.offer(current.left);
            queue.offer(current.right);
        }
        return serialize.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data == null || data.length()==0){
            return null;
        }
        String tem[] = data.split(" ");
        if(tem[0].equals("null")){
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(tem[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int index = 1;
        while(!queue.isEmpty()){
            TreeNode current = queue.poll();
            if(!tem[index].equals("null")){
                current.left = new TreeNode(Integer.parseInt(tem[index]));
                queue.offer(current.left);
            }
            index++;
            if(!tem[index].equals("null")){
                current.right = new TreeNode(Integer.parseInt(tem[index]));
                queue.offer(current.right);
            }
            index++;
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));