class Pair {
    int row;
    int col;

    Pair(int row, int col) {
        this.row = row;
        this.col = col;
    }
}
class Solution {
    public int numIslands(char[][] grid) {
        int numberIsLands = 0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == '1' && !visited[i][j]){
                    numberIsLands++;
                    bfs(i , j , grid , visited);
                }
            }
        }
        return numberIsLands;
    }
    public void bfs(int row , int col , char[][]grid , boolean[][] visited){
        Queue<Pair> queue = new LinkedList<>();
        visited[row][col] = true;
        int rowSize = grid.length;
        int colSize = grid[0].length;
        queue.offer(new Pair(row,col));
        while(queue.size()>0){
            Pair current = queue.poll();
            int[] directionRow = {-1,0,1,0};
            int[] directionCol = {0,1,0,-1};
            for(int i = 0; i<4; i++){
                int newRow = current.row + directionRow[i];
                int newCol = current.col + directionCol[i];
                if(newRow>=0 && newRow<=rowSize-1 && newCol>=0 && newCol<=colSize-1 && grid[newRow][newCol] == '1' && !visited[newRow][newCol]){
                    visited[newRow][newCol] = true;
                    queue.offer(new Pair(newRow,newCol));
                }
            }
        }
    }
}