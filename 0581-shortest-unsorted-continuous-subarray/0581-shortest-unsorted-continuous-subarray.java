class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int clone[] = nums.clone();
        Arrays.sort(clone);
        int start = -1, end = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != clone[i]) {
                if (start == -1) {
                    start = i;
                }
                end = i;
            }
        }
        if (start == -1) {
            return 0;
        } else {
            return end - start + 1;
        }
    }
}