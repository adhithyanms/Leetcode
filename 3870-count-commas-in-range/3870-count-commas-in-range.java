class Solution {
    public int countCommas(int n) {
        int totalCommas = 0;
        for (int i = 1; i <= n; i++) {
            String numStr = String.valueOf(i);
            int length = numStr.length();
            if (length > 3) {
                int commas = (length - 1) / 3;
                totalCommas += commas;
            }
        }
        return totalCommas;
    }
}