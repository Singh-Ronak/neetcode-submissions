class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n = board.length;
        int[][] rows = new int[n][n];
        int[][] cols = new int[n][n];
        int[][] boxes = new int[n][n];

        for(int r = 0; r<n; r++){
            for(int c = 0; c<n; c++){
                if(board[r][c] == '.') continue;
                int val = board[r][c] -'1';
                if(rows[r][val]==1) return false;
                rows[r][val]=1;
                if(cols[c][val]==1) return false;
                cols[c][val]=1;
                int boxIdx = 3*(r/3) + (c/3);
                if(boxes[boxIdx][val]==1) return false;
                boxes[boxIdx][val]=1;
            }
        }
        return true;
    }
}
