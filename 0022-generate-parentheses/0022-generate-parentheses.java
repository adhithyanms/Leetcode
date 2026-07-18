class Solution {
    List<String> ans = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        dfs(0, 0, n, "");
        return ans;
    }

    public void dfs(int close, int open, int n, String current) {
        if (close == open && close + open == 2 * n) {
            ans.add(current);
            return;
        }
        if (open < n) {
            dfs(close, open + 1, n, current + "(");
        }
        if (close < open) {
            dfs(close + 1, open, n, current + ")");
        }
    }
}