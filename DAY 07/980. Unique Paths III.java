class Solution {
    public int rows,cols;
    public int result=0;
    public int[][] d={{1,0},{-1,0},{0,1},{0,-1}};
    public int uniquePathsIII(int[][] grid) {
        rows=grid.length;
        cols=grid[0].length;
        int sx=-1,sy=-1;
        int obs=0;
        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                if (grid[i][j]!=-1) obs++;
                if (grid[i][j]==1) 
                { 
                    sx=i; 
                    sy=j; }
            }
        }
        backtrack(grid,sx,sy,obs);
        return result;
    }

    public void backtrack(int[][] grid,int x,int y,int remain) {
        if (x<0 || x>=rows || y<0 || y>=cols || grid[x][y]==-1) return;
        if (grid[x][y]==2) {
            if (remain==1) result++;
            return;
        }
        int temp=grid[x][y];
        grid[x][y]=-1;
        for (int[] dir:d) {
            backtrack(grid,x+dir[0],y+dir[1],remain-1);
        }
        grid[x][y]=temp;
    }
}
