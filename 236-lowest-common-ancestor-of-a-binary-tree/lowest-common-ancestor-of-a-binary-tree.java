/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;
        if(root.val == p.val || root.val == q.val){
            return root;
        }
        TreeNode lca1 = lowestCommonAncestor(root.left, p, q);
        TreeNode lca2 = lowestCommonAncestor(root.right, p, q);

        if(lca1!=null && lca2!=null){
            return root;
        }
        if(lca1!=null){
            return lca1;
        }
        else{
            return lca2;
        }

    }
}


// class Solution {
//     public boolean findPath(TreeNode root, ArrayList<TreeNode> a, TreeNode p){
//         if(root== null) return false;
//         a.add(root);
//         if(root.val == p.val) return true;
//         if(findPath(root.left, a, p) || findPath(root.right, a, p)) return true;
//         a.remove(a.size()-1);
//         return false;
//     }
//     public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//         ArrayList<TreeNode> path1 = new ArrayList<TreeNode>();
//         ArrayList<TreeNode> path2 = new ArrayList<TreeNode>();
//         if(findPath(root, path1, p)==false || findPath(root, path2, q)==false){
//             return null;
//         }
//         int i;
//         for(i =0;i<path1.size() && i<path2.size();i++){
//             if(path1.get(i).val != path2.get(i).val){
//                 break;
//             }
//         }
//         return path1.get(i-1);
//     }
// }