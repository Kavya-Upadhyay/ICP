class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int row=0; row<n; row++){
            for(int col=0; col<n; col++){
                if(row<col){
                    int temp = matrix[row][col];
                    matrix[row][col] = matrix[col][row];
                    matrix[col][row] = temp;
                }
            }
        }

        for(int row=0; row<n; row++){
            int i=0;
            int j=n-1;
            while(i<j){
                int temp = matrix[row][i];
                matrix[row][i] = matrix[row][j];
                matrix[row][j] = temp;
                i++;
                j--;
            }
        }
        
    }
}