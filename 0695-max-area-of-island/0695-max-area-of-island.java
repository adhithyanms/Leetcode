class Pair{
    int row;
    int col;
    Pair(int row , int col){
        this.row  = row;
        this.col = col;
    }
}
class Solution {
    int directionRow[] = {1,-1,0,0};
    int directionCol[] = {0,0,-1,1};
    int row , col ;
    public int maxAreaOfIsland(int[][] grid) {
        row = grid.length;
        col = grid[0].length;
        boolean [][]visited = new boolean[row][col];
        int maxArea = 0;
        for(int i = 0 ; i<row ; i++){
            for(int j = 0 ; j<col ; j++){
                if(grid[i][j]==1 && !visited[i][j]){
                    maxArea = Math.max(maxArea , bfs(i,j,grid,visited));
                }
            }
        }
        return maxArea;
    }

    public int bfs(int srow, int scol,int[][]grid , boolean[][]visited){
        visited[srow][scol] = true;
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(srow , scol));
        int area = 0;
        while(!queue.isEmpty()){
            area++;
            Pair current = queue.poll();
            for(int i = 0;i<4;i++){
                int newRow = current.row + directionRow[i];
                int newCol = current.col + directionCol[i];
                if(newRow>=0 && newCol>=0 && newRow<=row-1 && newCol<=col-1 && !visited[newRow][newCol] && grid[newRow][newCol]==1){
                    visited[newRow][newCol] = true;
                    queue.offer(new Pair(newRow , newCol));
                }
            }
        }
        return area;
    }

}