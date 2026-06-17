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
    boolean ans = true;
    public int helper( TreeNode root)
    {
        if(root == null) return 0;
        int lhs = helper(root.left);
        int rhs = helper(root.right);
        int height = Math.max(lhs ,rhs) + 1;
        if(Math.abs(lhs-rhs) > 1)
        {
            ans = false;

        }
        return height;

    }
    public boolean isBalanced(TreeNode root) {
        helper(root);
        return ans;
    }
}