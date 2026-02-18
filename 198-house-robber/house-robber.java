class Solution {
    public int solve(int [] arr , int [] dp , int n)
    {
        if(n == 0)
        {
            return arr[n];
        }
        if(n == -1)
        {
            return 0;
        }
        if(dp[n] != -1)
        {
            return dp[n];
        }
        int pick = arr[n] + solve(arr,dp,n-2);
        int npick = 0 + solve(arr,dp,n-1);
        return dp[n] = Math.max(pick,npick);
    }
    public int rob(int[] nums) {
        int n = nums.length - 1;
        int dp [] = new int[nums.length+1];
        Arrays.fill(dp,-1);
        return solve(nums,dp,n);
    }
}