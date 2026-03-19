class Solution {
    public int solve(char [] s1 , char [] s2 , int n ,int m,int [] [] dp)
    
    {
        if(n == 0 || m == 0)
        {
            return 0;
        }
        else if(dp[n][m] != -1)
        {
            return dp[n][m];
        }
        else if(s1[n-1] == s2[m-1])
        {
            return 1 + solve(s1,s2,n-1,m-1,dp);
        }
        else
        return dp[n][m] = Math.max(solve(s1,s2,n,m-1,dp),solve(s1,s2,n-1,m,dp));

    }
    public int longestCommonSubsequence(String text1, String text2) {
       int n = text1.length();
       int m = text2.length();
       char [] ch1 = text1.toCharArray();
       char [] ch2 = text2.toCharArray();
       int [] [] dp = new int[n+1][m+1];
        for(int [] num : dp)
        {
            Arrays.fill(num,-1);
        }
      
      return solve(ch1,ch2,n,m,dp);
    }
}