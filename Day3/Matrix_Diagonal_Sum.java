class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum1=0;
        
    
        for(int row = 0; row<n; row++){    
            sum1+=mat[row][row]+mat[row][n-row-1];
        }
        

        if(n%2 == 0){
            return sum1;
        }

        int common = n/2;
        return sum1-mat[common][common];


        
    }
}