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
    public TreeNode searchRoot(TreeNode root, int val){
        if(root == null){
            return null;
        }
        else if(root.val > val){
            if(root.left == null){
                return root;
            }
            return searchRoot(root.left, val);
        }
        else{
            if(root.right == null){
                return root;
            }
            return searchRoot(root.right, val);
        }

    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode insert = new TreeNode();
        TreeNode insertVal = new TreeNode(val);
        if(root == null){
            return insertVal;
        }
        insert = searchRoot(root, val);
        if(insert.val > val){
            insert.left = insertVal;
        }
        else insert.right = insertVal;
        return root;
    }
}