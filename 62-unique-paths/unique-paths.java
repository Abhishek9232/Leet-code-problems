class Solution {
    public int solve(int m , int n,int [][]dp)
    {
        if(m == 0 && n == 0)
        {
            return 1;
        }
        if(dp[m][n]!= -1)
        {
            return dp[m][n];
        }
        if(m == 0)
        {
            return dp[m][n] = solve(m,n-1,dp);
        }
        else if(n == 0)
        {
           return dp[m][n] = solve(m-1,n,dp);
        }
        return dp[m][n] = solve(m-1,n,dp) + solve(m,n-1,dp);
    }
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];
        for(int a[] : dp)
        {
            Arrays.fill(a,-1);
        }
        return solve(m-1,n-1,dp);
    }
}