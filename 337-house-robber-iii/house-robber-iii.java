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
    int first;
    int second;
    Pair(int f ,int s)
    {
        first = f;
        second = s;
    }
 }
class Solution {
    public Pair helper(TreeNode root)
    {
        if(root == null) return new Pair(0,0);
        Pair lhs = helper(root.left);
        Pair rhs = helper(root.right);
        int myleft = (root.val + lhs.second + rhs.second);
        int myright = Math.max(lhs.first,lhs.second) +Math.max(rhs.first,rhs.second);
        return  new Pair(myleft,myright);

    }
    public int rob(TreeNode root) {
       Pair ans = helper(root);
       return Math.max(ans.first,ans.second);
    }
}