class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int freq[] = new int[51];
        int n = nums.length;
        int ans[] = new int[n - k + 1];
        for (int i = 0; i <= n - k; i++) {
            Arrays.fill(freq, 0);
            for (int j = i; j < i + k; j++) {
                freq[nums[j]]++;
            }
            List<int[]> freqList = new ArrayList<>();
            for (int v = 0; v < 51; v++) {
                if (freq[v] > 0) {
                    freqList.add(new int[] { v, freq[v] });
                }
            }
            freqList.sort((a, b) -> {
                if (a[1] == b[1]) {
                    return b[0] - a[0];
                }
                return b[1] - a[1];
            });
            int xSum = 0;
            int count = 0;
            for (int pair[] : freqList) {
                if (count == x)
                    break;
                count++;
                xSum += pair[0] * pair[1];
            }
            ans[i] = xSum;
        }
        return ans;
    }
}