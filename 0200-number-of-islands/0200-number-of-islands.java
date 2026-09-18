class Pair {
    int row, col;

    Pair(int row, int col) {
        this.row = row;
        this.col = col;
    }
}

class Solution {
    public int numIslands(char[][] grid) {
        int numberOfIslands = 0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    numberOfIslands++;
                    bfs(i, j, grid, visited);
                }
            }
        }
        return numberOfIslands;
    }

    public void bfs(int currentRow, int currentCol, char[][] grid, boolean[][] visited) {
        Queue<Pair> queue = new LinkedList<>();
        int row = grid.length;
        int col = grid[0].length;
        visited[currentRow][currentCol] = true;
        queue.offer(new Pair(currentRow, currentCol));
        while (!queue.isEmpty()) {
            Pair current = queue.poll();
            int[] rowDir = { -1, 0, 1, 0 };
            int[] colDir = { 0, 1, 0, -1 };
            for (int i = 0; i < 4; i++) {
                int newRow = current.row + rowDir[i];
                int newCol = current.col + colDir[i];
                if (newRow >= 0 && newCol >= 0 && newRow <= row - 1 && newCol <= col - 1 && grid[newRow][newCol] == '1'
                        && !visited[newRow][newCol]) {
                    visited[newRow][newCol] = true;
                    queue.offer(new Pair(newRow, newCol));
                }
            }
        }
    }
}