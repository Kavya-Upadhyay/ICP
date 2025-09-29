Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int start = 0;
        int end = m*n-1;

        while(start <= end){
            int mid = start + (end-start)/2;

            if(matrix[mid/n][mid%n] == target){
                return true;
            }

            else if(matrix[mid/n][mid%n] < target){
                start = mid+1;
            }

            else{
                end = mid-1;
            }
        }
        return false;
    }
}