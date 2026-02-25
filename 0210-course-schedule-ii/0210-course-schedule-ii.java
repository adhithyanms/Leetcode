class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] ans = new int[numCourses];
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            graph.add(new ArrayList<>());
        }
        for(int [] p : prerequisites){
            int ai = p[0];
            int bi = p[1];
            graph.get(bi).add(ai);
        }
        int indegree[] = new int[numCourses];
        for(int i = 0 ;i<numCourses ;i++){
            for(int node : graph.get(i)){
                indegree[node]++;
            }
        }
        Queue<Integer> inDegreeQueue = new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                inDegreeQueue.offer(i);
            }
        }
        ArrayList<Integer> currentAns = new ArrayList<>();
        while(!inDegreeQueue.isEmpty()){
            int currentNode = inDegreeQueue.poll();
            currentAns.add(currentNode);
            for(int node : graph.get(currentNode)){
                indegree[node]--;
                if(indegree[node]==0){
                    inDegreeQueue.offer(node);
                }
            }
        }
        int index=0;
        if(currentAns.size()==0 || currentAns.size()<numCourses){
            return new int[]{};
        }
        else{
            for(int n:currentAns){
                ans[index++]=n;
            }
        }
        return ans;
    }
}