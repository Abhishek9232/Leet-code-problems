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
 class Pair
 {
    int dia;
    int hei;
    Pair(int di,int he)
    {
        dia = di;
        hei = he;
    }
 }
 
class Solution {
    public Pair helper(TreeNode root)
    {
        if(root == null) return new Pair(0,0);
        Pair lhs = helper(root.left);
        Pair rhs = helper(root.right);
        int lhsd = lhs.dia;
        int rhsd = rhs.dia;
        int lhsh = lhs.hei;
        int rhsh = rhs.hei;
        int fromroot = lhsh + rhsh + 1;
        int d1 = Math.max(lhsd,rhsd);
        int ans = Math.max(fromroot,d1);
        int height = Math.max(lhsh,rhsh)+1;
        return new Pair(ans,height); 
    }
    public int diameterOfBinaryTree(TreeNode root) {
        return helper(root).dia-1;
    }
}