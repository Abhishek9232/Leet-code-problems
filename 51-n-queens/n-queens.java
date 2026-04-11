class Solution {
    public boolean issafe(char [][]board,int x,int y,int n)
    {
	int row,col;
	//column
	row=x-1;
	col=y;
	while(row>=0)
	{
		if(board[row][col]=='Q')
			return false;
		row-=1;
	}
	//left diagonal
	row=x;
	col=y;
	while(row>=0 && col>=0)
	{
		if(board[row][col]=='Q')
			return false;
		row-=1;
		col-=1;
	}
	//right diagonal
	row=x;
	col=y;
	while(row>=0 && col<n)
	{
		if(board[row][col]=='Q')
			return false;
		row-=1;
		col+=1;
	}
	return true;
    }
    public void solve(char [][]board,int x,int n, List<List<String>> fr)
    {
        if(x==n)
        {
            List<String> co=new ArrayList<>();
            for(char []row:board)
            {
                String rv="";
                for(char ch:row)
                {
                    rv+=ch;
                }
                co.add(rv);
            }
            fr.add(co);
            return;
        }
        for(int y=0;y<n;y++)
        {
            if(issafe(board,x,y,n))
            {
                board[x][y]='Q';
                solve(board,x+1,n,fr);
                board[x][y]='.';
            }
        }
    }
       
    public List<List<String>> solveNQueens(int n) {
	char [][]board=new char[n][n];
	for(char []row:board)
	{
		Arrays.fill(row,'.');
	}
	List<List<String>> fr=new ArrayList<>();
	solve(board,0,n, fr);
    
    return fr;
    }
}