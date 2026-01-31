class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj= new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        int [] indeg=new int[numCourses];
        for(int [] p:prerequisites){
            int ai=p[0];
            int bi=p[1];
            adj.get(bi).add(ai);
            indeg[ai]++;
        }
        Queue<Integer>queue= new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indeg[i]==0){
                queue.offer(i);
            }
        }
        ArrayList<Integer> ans =new ArrayList<>();
        while(queue.size()>0){
            int node =queue.poll();
            ans.add(node);
            for(int a: adj.get(node)){
                indeg[a]--;
                if(indeg[a]==0){
                    queue.offer(a);
                }
            }
        }
    return ans.size()==numCourses;
    }
}