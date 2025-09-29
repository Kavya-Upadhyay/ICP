class Solution {
    public int countNegatives(int[][] grid) {

        int count=0;
        int n = grid[0].length;
        for(int row=0; row<grid.length; row++){
            int start=0;
            int end=n-1;
            int ans=n;
            while(start <= end){
                int mid = start + (end-start)/2;

                if(grid[row][mid] < 0){
                    ans = mid;
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            count = count + (n-ans);
        }
        return count;

        
    }
}