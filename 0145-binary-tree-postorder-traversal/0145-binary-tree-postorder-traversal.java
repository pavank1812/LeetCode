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
    List<Integer> List = new ArrayList();
    public List<Integer> postorderTraversal(TreeNode root) {
        postorderTrav(root);
        return List;
        
    }
    private void postorderTrav(TreeNode Node){
        if(Node == null){
            return;
        }
        postorderTrav(Node.left);
        postorderTrav(Node.right);
        List.add(Node.val);
    }
}

