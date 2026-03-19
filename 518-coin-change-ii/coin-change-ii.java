class Solution {
    public static int solve(int [] coins , int n , int amount,int dp [] [])
    {
      if(amount == 0)
      {
        return 1;
      }
      else if(n == 0)
      {
        return 0;
      }
      else if(dp[n][amount] != -1)
      {
        return dp[n][amount];
      }
      else if(coins[n-1] > amount)
      {
        return dp[n][amount] = solve(coins,n-1,amount,dp);
      }
      else
      {
        return dp[n][amount] = solve(coins,n, amount - coins[n-1],dp) + solve(coins,n-1,amount,dp);
      }
    }
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int dp [] []= new int[n+1][amount + 1];
        for(int i = 0;i<dp.length;i++)
        {
            for(int j = 0;j<dp[0].length;j++)
            {
                dp[i][j] = -1;
            }
        }
        return solve(coins,n,amount,dp);
    }
}