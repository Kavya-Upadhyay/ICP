class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int total_nums=n*n;
        int num=1;

        int top=0;
        int bottom=n-1;
        int left=0;
        int right=n-1;
        while(num <= total_nums){
            for(int i=left; i<=right; i++){
                ans[top][i] = num;
                num++;
            }
            top++;

            for(int i=top; i<=bottom; i++){
                ans[i][right] = num;
                num++;
            }
            right--;

            for(int i=right; i>=left; i--){
                ans[bottom][i] = num;
                num++;
            }
            bottom--;

            for(int i=bottom; i>=top; i--){
                ans[i][left] = num;
                num++;
            }
            left++;
        }   
        return ans;
    }
}