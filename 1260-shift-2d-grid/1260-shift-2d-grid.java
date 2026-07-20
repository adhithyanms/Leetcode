class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        while (k-- > 0) {
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (i == 0 && j == 0) {
                        continue;
                    }
                    swap(grid, i, j);
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        for (int[] n : grid) {
            List<Integer> current = new ArrayList<>();
            for (int i : n) {
                current.add(i);
            }
            ans.add(new ArrayList<>(current));
        }
        return ans;
    }

    public static void swap(int[][] grid, int i, int j) {
        int tem = grid[i][j];
        grid[i][j] = grid[0][0];
        grid[0][0] = tem;
    }
}