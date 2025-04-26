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
    public int countNodes(TreeNode root) {
        // if(root == null) return 0;
        // int lh = 0, rh = 0;
        // TreeNode curr = root;
        // while(curr.left != null){
        //     lh++;
        //     curr = curr.left;
        // }
        // curr = root;
        // while(curr.right != null){
        //     rh++;
        //     curr = curr.right;
        // }
        // if(lh == rh){
        //     return (int)Math.pow(2, lh+1) -1;
        // }
        // return 1+countNodes(root.left)+countNodes(root.right);

        if(root==null) return 0;
        else return 1+countNodes(root.left)+countNodes(root.right);


        // int size = 1;
        // Queue<TreeNode> q = new LinkedList<>();
        // q.add(root);
        // while(q.isEmpty()== false){
        //     int count = q.size();
        //     for(int i =0;i<count;i++){
        //         TreeNode curr = q.poll();
        //         if(curr.left!=null){
        //             q.add(curr.left);
        //             size++;
        //         }
        //         if(curr.right!=null){
        //             q.add(curr.right);
        //             size++;
        //         }
        //     }
        // }
        // return size;
    }
}