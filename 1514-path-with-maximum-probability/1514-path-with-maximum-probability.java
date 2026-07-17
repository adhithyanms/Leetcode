class Pair {
    int val;
    double prob;

    Pair(int val, double prob) {
        this.val = val;
        this.prob = prob;
    }
}

class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        List<List<Pair>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < edges.length; i++) {
            int from = edges[i][0];
            int to = edges[i][1];
            double prob = succProb[i];
            graph.get(from).add(new Pair(to,prob));
            graph.get(to).add(new Pair(from,prob));
        }
        double maxProb[] = new double[n];
        maxProb[start_node] = 1.0;
       PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> Double.compare(b.prob, a.prob));
        pq.offer(new Pair(start_node , 1.0));
        while(!pq.isEmpty()){
            Pair current = pq.poll();
            if(current.val == end_node){
                return current.prob;
            }
            for(Pair p : graph.get(current.val)){
                double newProb = p.prob*current.prob;
                if(maxProb[p.val]<newProb){
                    maxProb[p.val] = newProb;
                    pq.offer(new Pair(p.val,newProb));
                }
            }
        }
        return 0.0;
    }
}