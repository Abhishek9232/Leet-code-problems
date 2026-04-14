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
    
       
    public int maxDepth(TreeNode root) {
      int count=0;
       
       if(root == null)
        {
            return 0;
        }
        int m1 = 1+maxDepth(root.left);
        
       int m2 = 1+maxDepth(root.right);
       return Math.max(m1,m2);
    }
}