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
    int maxval = Integer.MIN_VALUE;
    public int helper(TreeNode root)
    {
        if(root == null) return 0;
        int lhs = Math.max(helper(root.left),0);
        int rhs = Math.max(helper(root.right),0);
        int first = lhs + rhs + root.val;
        maxval = Math.max(maxval,first);
        return root.val + Math.max(lhs,rhs);
        
        
    }
    public int maxPathSum(TreeNode root) {
        helper(root);
        return maxval;
    }
}