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
    void serializehelp(TreeNode root, StringBuilder ans) {
        
        if(root == null){
            ans.append("* ");
            return;
        }
        ans.append(root.val).append(" ");
        serializehelp(root.left, ans);
        serializehelp(root.right, ans);
    }
    public String serialize(TreeNode root) {
        StringBuilder output = new StringBuilder();
        serializehelp(root, output);
        return output.toString();
        
    }

    public TreeNode deserializehelp(String[] data, int[] index){
        if(index[0]>=data.length) return null;
        String currVal = data[index[0]];
        index[0]++;
        if(currVal.equals("*")) return null;

        TreeNode root = new TreeNode(Integer.parseInt(currVal));
        root.left = deserializehelp(data, index);
        root.right = deserializehelp(data, index);
        return root;
    }
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] nodeValues = data.split(" ");
        int[] index = new int[1];
        return deserializehelp(nodeValues, index);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));