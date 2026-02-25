class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if(n==1){
            return Arrays.asList(0);
        }
        int degree[] = new int[n];
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i = 0; i<n ;i++){
            graph.add(new ArrayList<>());
        }
        for(int [] edge : edges){
            int ai = edge[0];
            int bi = edge[1];
            graph.get(ai).add(bi);
            graph.get(bi).add(ai);
            degree[ai]++;
            degree[bi]++;
        }
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0;i<n;i++){
            if(degree[i]==1){
                queue.offer(i);
            }
        }
        int nodeSize = n;
        while(nodeSize>2){
           int size = queue.size();
           nodeSize-=size;
           for(int i = 0;i<size;i++){
                int current = queue.poll();
                for(int neighbour : graph.get(current)){
                    degree[neighbour]--;
                    if(degree[neighbour]==1){
                        queue.offer(neighbour);
                    }
                }
           }
        }
        return new ArrayList<>(queue);
    }
}