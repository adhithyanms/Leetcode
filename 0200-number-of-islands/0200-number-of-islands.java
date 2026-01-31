class Pair{
    int row;
    int col;
    Pair(int _row,int _col){
        this.row=_row;
        this.col=_col;
    }
}
class Solution {
    public void bfs(int row,int col,char[][]grid , boolean[][]vis){
        int m=grid.length;
        int n=grid[0].length;
        Queue<Pair> queue =new LinkedList<>();
        queue.offer(new Pair(row,col));
        vis[row][col]=true;
        int []directionRow={-1,0,1,0};
        int []directionCol={0,1,0,-1};
        while(queue.size()>0){
           Pair curr=queue.poll();
           for(int i=0;i<4;i++){
            int newRow=curr.row+directionRow[i];
            int newCol=curr.col+directionCol[i];
            if(newRow>=0 && newRow<=m-1 && newCol>=0 && newCol<=n-1 && !vis[newRow][newCol] && grid[newRow][newCol]=='1'){
                queue.offer(new Pair(newRow,newCol));
                vis[newRow][newCol]=true;
            }
           }
        }
    }
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int numOfIslands=0;
        boolean [][]vis=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1' && !vis[i][j]){
                    numOfIslands++;
                    bfs(i,j,grid,vis);
                }
            }
        }
        return numOfIslands;
    }
}