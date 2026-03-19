class Pair{
    int val;
    int row;
    Pair(int val , int row){
        this.val =val;
        this.row = row;
    }
}
class Solution {
    public int findMaxValueOfEquation(int[][] points, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->b.val - a.val);
        int max = Integer.MIN_VALUE;
        for(int point[] : points){
            int rowi = point[0];
            int coli = point[1];
            while(!pq.isEmpty() && rowi-pq.peek().row>k){
                pq.poll();
            }
            if(!pq.isEmpty()){
                max = Math.max(max , pq.peek().val+rowi+coli);
            }
            pq.offer(new Pair(coli-rowi ,rowi ));
        }
        return max;
    }
}