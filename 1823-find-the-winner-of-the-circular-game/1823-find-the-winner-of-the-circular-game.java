class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            ans.add(i);
        }
        game(ans, 0, k);
        return ans.get(0);
    }

    public void game(List<Integer> ans, int index, int k) {
        if (ans.size() == 1) {
            return;
        }
        index = (index + k - 1) % ans.size();
        ans.remove(index);
        game(ans, index, k);
    }
}