class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        boolean []visited = new boolean[n];
        for(int [] edge : edges){
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        return dfs(graph , visited , source , destination);
    }

    public boolean dfs(List<List<Integer>> graph , boolean [] visited , int source , int destination){
        if(source == destination){
            return true;
        }
        visited[source] = true;
        for(int current : graph.get(source)){
            if(!visited[current]){
                if(dfs(graph , visited,current , destination )){
                    return true;
                }
            }
        }
        return false;
    }
}