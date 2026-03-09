class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int minDiffer = Integer.MAX_VALUE;
        Arrays.sort(nums);
        int closestSum = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                int diff = Math.abs(sum - target);
                if (diff < minDiffer) {
                    minDiffer = diff;
                    closestSum = sum;
                }
                if (sum == target) {
                    return sum;
                }
                if (sum > target) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return closestSum;
    }
}