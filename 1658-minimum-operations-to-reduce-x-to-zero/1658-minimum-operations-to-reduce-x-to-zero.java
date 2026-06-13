class Solution {
    public int minOperations(int[] nums, int x) {
        int left = 0;
        int target = -x;
        for (int n : nums)
            target += n;
        if(target == 0)return nums.length;
        int currentSum = 0;
        int maxLength = 0;
        for (int right = 0; right < nums.length; right++) {
            currentSum += nums[right];
            while (currentSum > target && left < nums.length) {
                currentSum -= nums[left++];
            }
            if (currentSum == target) {
                maxLength = Math.max(maxLength, right - left + 1);
            }
        }
        return maxLength != 0 ? nums.length - maxLength : -1;
    }
}