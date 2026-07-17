class Solution {
    public int findCircleNum(int[][] isConnected) {
        int numberOfProvinces = 0;
        int size = isConnected.length;
        boolean []visited = new boolean[size+1];
        for(int i = 0 ; i<size;i++){
            if(!visited[i]){
                numberOfProvinces++;
                bfs(isConnected , visited , i);
            }
        }
        return numberOfProvinces;
    }
    public void bfs(int[][] isConnected , boolean []visited , int currentIndex){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(currentIndex);
        while(!queue.isEmpty()){
            int current = queue.poll();
            for(int i = 0 ;i<isConnected.length;i++){
                if(isConnected[current][i]==1 && !visited[i]){
                    queue.offer(i);
                    visited[i] = true;
                }
            }
        }
    }
}