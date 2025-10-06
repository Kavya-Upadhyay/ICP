class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res=new ArrayList<>();
        boolean[][] board=new boolean[n][n];
        queens(board, 0, res);
        return res;
    }
    public void queens(boolean[][] board, int row, List<List<String>> res) {
        if (row==board.length) {
            res.add(construct(board));
            return;
        }

        for (int col=0; col<board[0].length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col]=true;
                queens(board, row + 1, res);
                board[row][col]=false;
            }
        }
    }

    public boolean isSafe(boolean[][] board, int row, int col) {
        // check column
        for (int i=0; i<row; i++) {
            if (board[i][col]) return false;
        }

        //left diagonal
        for (int i=row - 1, j=col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j]) return false;
        }

        //right diagonal
        for (int i=row - 1, j=col + 1; i >= 0 && j<board.length; i--, j++) {
            if (board[i][j]) return false;
        }

        return true;
    }

    public List<String> construct(boolean[][] board) {
        List<String> ll=new ArrayList<>();
        for (int i=0; i<board.length; i++) {
            StringBuilder sb=new StringBuilder();
            for (int j=0; j<board[0].length; j++) {
                sb.append(board[i][j] ? 'Q' : '.');
            }
            ll.add(sb.toString());
        }
        return ll;
    }
}
