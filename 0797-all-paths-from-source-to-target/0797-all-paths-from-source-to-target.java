class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
     
        List<Integer> path =new ArrayList<>();
        dfs(graph,0,path);
        return ans;
    }
    public  void dfs(int[][]graph,int node,List<Integer> path){
        path.add(node);
        if(node==graph.length-1){
            ans.add(new ArrayList<>(path));
        }
        else{
            for(int neighbour:graph[node]){
                dfs(graph,neighbour,path);
            }
        }
        path.remove(path.size()-1);
    }
}