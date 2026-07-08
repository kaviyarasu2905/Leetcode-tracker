// Last updated: 08/07/2026, 15:42:00
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
     ArrayList<Integer> ans=new ArrayList();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root!=null){
            inorderTraversal(root.left);
            ans.add(root.val);
            inorderTraversal(root.right);
        }
        return ans;
    }
}