class Solution {
    public int minOperations(int[] nums) {
        int count = 0;
        for (int left = 0; left < nums.length-2; left++) {
            if (nums[left] == 0) {
                count++;
                for (int right = left; right < left + 3; right++) {
                    nums[right] = nums[right] == 0 ? 1 : 0;
                }
            }
        }
        Arrays.sort(nums);
        return nums[0] == 0 ? -1 : count;
    }
}