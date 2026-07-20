class Pair {
    int row;
    int val;

    Pair(int row, int val) {
        this.row = row;
        this.val = val;
    }
}

class Solution {
    public int findMaxValueOfEquation(int[][] points, int k) {
        int ans = Integer.MIN_VALUE;
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> b.val - a.val);
        for (int point[] : points) {
            int rowi = point[0];
            int coli = point[1];
            while (!pq.isEmpty() && rowi - pq.peek().row > k) {
                pq.poll();
            }
            if (!pq.isEmpty()) {
                ans = Math.max(ans, rowi + coli + pq.peek().val);
            }
            pq.offer(new Pair(rowi, coli-rowi));
        }
        return ans;
    }
}