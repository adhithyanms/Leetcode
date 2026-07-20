class Solution {
    int rowDirection[] = { -1, 1, 0, 0 };
    int colDirection[] = { 0, 0, 1, -1 };
    int row;
    int col;

    public void solve(char[][] board) {
        row = board.length;
        col = board[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if ((i == 0 || j == 0 || i == row - 1 || j == col - 1 )&& board[i][j] == 'O') {
                    board[i][j] = '1';
                    dfs(board, i, j);
                }
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] == '1') {
                    board[i][j] = 'O';
                } else {
                    board[i][j] = 'X';
                }
            }
        }
    }

    public void dfs(char[][] board, int r, int c) {
        for (int i = 0; i < 4; i++) {
            int newRow = r + rowDirection[i];
            int newCol = c + colDirection[i];
            if (newRow >= 0 && newCol >= 0 && newRow < row && newCol < col && board[newRow][newCol] == 'O') {
                board[newRow][newCol] = '1';
                dfs(board, newRow, newCol);
            }
        }
    }
}