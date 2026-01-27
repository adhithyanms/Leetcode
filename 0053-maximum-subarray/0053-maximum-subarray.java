class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = -1, left = 0, sum = 0;
        if(nums.length==1)return nums[0];
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum < 0) {
                sum -= nums[left];
                left++;
            }
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}