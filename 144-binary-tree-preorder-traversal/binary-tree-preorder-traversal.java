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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(root==null) return ans;
        Stack<TreeNode> temp = new Stack<>();
        TreeNode curr = root;
        temp.push(root);
        while(temp.isEmpty()==false){
            TreeNode curr1 = temp.pop();
            ans.add(curr1.val);
            if(curr1.right!=null){
                temp.push(curr1.right);
            }
            if(curr1.left!=null){
                temp.push(curr1.left);
            }
        }
        return ans;
    }
}