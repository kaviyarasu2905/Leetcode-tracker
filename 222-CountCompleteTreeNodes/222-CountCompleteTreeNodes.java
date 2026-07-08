// Last updated: 08/07/2026, 15:40:38
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
    int c=0;
    public int countNodes(TreeNode root) {
        if(root!=null){
            countNodes(root.left);
              countNodes(root.right);
              c++;
        }
        return c;
    }
}