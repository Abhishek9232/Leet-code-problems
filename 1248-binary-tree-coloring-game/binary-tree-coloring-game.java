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
    int ls = 0;
    int rs = 0;
    public boolean btreeGameWinningMove(TreeNode root, int n, int x) {
        helper(root,x);
       int num = n-(ls+rs+1);
       int max1 = Math.max(num,Math.max(ls,rs));
       return max1>n/2;
    }
   public int helper(TreeNode root ,int x)
    {
        if(root == null) return 0;
        int lhs = helper(root.left,x);
    int rhs = helper(root.right,x);
    if(root.val == x)
    {
        ls = lhs;
        rs = rhs;
    }

    return 1+lhs+rhs;
    }
    
}