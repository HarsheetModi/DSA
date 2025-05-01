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
        while(curr!=null && temp.isEmpty()==false){
            ans.add((temp.pop()).val);
            if(curr.right!=null){
                temp.push(curr.right);
            }
            if(curr.left!=null){
                temp.push(curr.left);
            }
            if(temp.isEmpty()==false) curr = temp.peek();
        }
        return ans;
    }
}