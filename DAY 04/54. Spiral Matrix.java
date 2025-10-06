class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix.length == 0 || matrix[0].length == 0) {
            return result;  
        }
        int l = matrix.length;
        int l2 = matrix[0].length;
        int minr = 0;  
        int maxr = l - 1;  
        int minc = 0; 
        int maxc = l2 - 1;  
        int totalElements = l * l2;
        while (result.size() < totalElements) {
            for (int i = minc; i <= maxc && result.size() < totalElements; i++) {
                result.add(matrix[minr][i]);
            }
            minr++; 
            for (int i = minr; i <= maxr && result.size() < totalElements; i++) {
                result.add(matrix[i][maxc]);
            }
            maxc--; 
            for (int i = maxc; i >= minc && result.size() < totalElements; i--) {
                result.add(matrix[maxr][i]);
            }
            maxr--; 
            for (int i = maxr; i >= minr && result.size() < totalElements; i--) {
                result.add(matrix[i][minc]);
            }
            minc++; 
        }
        return result;
    }
}
