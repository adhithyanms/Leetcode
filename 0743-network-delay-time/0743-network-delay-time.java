class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        int[] distance = new int[n + 1];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[k] = 0;
        for (int i = 1; i < n; i++) {
            for (int[] time : times) {
                int from = time[0];
                int to = time[1];
                int weight = time[2];
                if (distance[from] != Integer.MAX_VALUE && distance[from] + weight < distance[to]) {
                    distance[to] = distance[from] + weight;
                }
            }
        }

        int result = -1;
        for (int i = 1; i <= n; i++) {
            if (distance[i] == Integer.MAX_VALUE) {
                return -1;
            }
            result = Math.max(result, distance[i]);
        }
        return result;
    }
}