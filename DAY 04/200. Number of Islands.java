import java.util.*;
class Cell {
    int r,c;
    Cell(int r, int c) 
    { 
        this.r=r; 
        this.c=c; 
    }
}
public class Solution {
    static int[][] direct={{1,0},{-1,0},{0,1},{0,-1}};
    public int numIslands(char[][] grid) {
        int rows=grid.length,cols=grid[0].length,count=0;
        boolean[][] visited=new boolean[rows][cols];
        for(int r=0;r<rows;r++){
            for(int c=0;c<cols;c++){
                if(grid[r][c]=='1' && !visited[r][c]){
                    count++;
                    bfs(grid,visited,r,c,rows,cols);
                }
            }
        }
        return count;
    }
    private void bfs(char[][] g,boolean[][] visited,int sr,int sc,int rows,int cols){
        Queue<Cell> q=new ArrayDeque<>();
        q.add(new Cell(sr,sc));
        visited[sr][sc]=true;
        while(!q.isEmpty()){
            Cell cur=q.poll();
            for(int[] d:direct){
                int nr=cur.r+d[0],nc=cur.c+d[1];
                if(nr>=0 && nr<rows && nc>=0 && nc<cols && !visited[nr][nc] && g[nr][nc]=='1'){
                    visited[nr][nc]=true;
                    q.add(new Cell(nr,nc));
                }
            }
        }
    }
}
