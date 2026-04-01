class Solution {
    int total = 0;
    int count = 0;
    public void solve(int i ,int j , int [][]grid , int visited)
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
        int temp = grid[i][j];
        grid[i][j] = -1;
        solve(i,j-1,grid,visited+1);
        solve(i,j+1,grid,visited+1);
        solve(i+1,j,grid,visited+1);
        solve(i-1,j,grid,visited+1);
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
        solve(startx,starty,grid,0);
        return count++;
    }
}