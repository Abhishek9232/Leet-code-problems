class Solution {
    public int solve(int m,int n,int [][] arr,int [][]dp)
    {
       if(arr[m][n] == 1)
       {
        return 0;
       }
       else if(arr[m][n] == 0)
       {
        
        if(m == 0 && n == 0)
        {
            return 1;
        }
        if(dp[m][n] != -1)
        {
            return dp[m][n];
        }
        if(m == 0)
        {
            return dp[m][n]=solve(m,n-1,arr,dp);
        }
        else if(n == 0)
        {
            return dp[m][n]=solve(m-1,n,arr,dp);
        }
       }
        return dp[m][n] =  solve(m,n-1,arr,dp) + solve(m-1,n,arr,dp);
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int dp[][] = new int[m][n];
        for(int a[] : dp)
        {
            Arrays.fill(a,-1);
        }
        return solve(m-1,n-1,obstacleGrid,dp);
    }
}