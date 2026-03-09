class Solution {
    public int jump(int[] nums) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[nums.length];
        int jumpCount = 0;
        queue.offer(0);
        visited[0] = true;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int index = queue.poll();
                if (index == nums.length - 1) {
                    return jumpCount;
                }
                for (int step = 1; step <=nums[index]; step++) {
                    int next = index + step;
                    if (next < nums.length && !visited[next]) {
                        queue.offer(next);
                        visited[next] = true;
                    }
                }
            }
            jumpCount++;
        }
        return jumpCount;
    }
}