class Solution {
    public int totalNQueens(int n) {
        boolean[][] board=new boolean[n][n];
        return backtrack(board,0);        
    }
    public int backtrack(boolean[][] board,int row)
    {
        if(row==board.length) return 1;
        int c=0;
        for(int col=0;col<board[0].length;col++)
        {
            if(isSafe(board,row,col))
            {
                board[row][col]=true;
                c+=backtrack(board,row+1);
                board[row][col]=false;
            }
        }
        return c;
    }
    public boolean isSafe(boolean[][] board,int row,int col)
    {
        for(int i=0;i<row;i++)
        {
            if(board[i][col]) return false;
        }

        // left diagonal
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--)
        {
            if(board[i][j]) return false;
        }
        // right diagonal
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++)
        {
            if(board[i][j]) return false;
        }
        return true;
    }

}