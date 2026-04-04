class Solution {
    int total = 0;
    int count = 0;
    public void solve(int i ,int j , int [][]grid , int visited,int dp[][])
    {
        if(i<0 || j <0  || i >= grid.length || j >= grid[0].length || grid[i][j] == -1 )
        {
            return ;
        }
        if(grid[i][j] == 2)
        {
            if(visited + 1 == total)
            {
                count++;
            }
        }
        if(dp[i][j] != -2)
        {
            
        }
        int temp = grid[i][j];
        grid[i][j] = -1;
        solve(i,j-1,grid,visited+1,dp);
        solve(i,j+1,grid,visited+1,dp);
        solve(i+1,j,grid,visited+1,dp);
        solve(i-1,j,grid,visited+1,dp);
        grid[i][j] = temp;
    }
    public int uniquePathsIII(int[][] grid) {
        
        int startx = 0;
        int starty = 0;
        for(int i =0;i<grid.length;i++)
        {
            for(int j =0;j<grid[0].length;j++)
            {
                if(grid[i][j]!= -1)
                {
                    total++;
                }
                if(grid[i][j] == 1)
                {
                    startx = i;
                    starty = j;
                }
            }
        }
        int n = grid.length;
        int m = grid[0].length;

        int dp[][] = new int[n][m];
        for(int [] a : dp)
        {
            Arrays.fill(a,-2);
        }
        solve(startx,starty,grid,0,dp);
        return count++;
    }
}