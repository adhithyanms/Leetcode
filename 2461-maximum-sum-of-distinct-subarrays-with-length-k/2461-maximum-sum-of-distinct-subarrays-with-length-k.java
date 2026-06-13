class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int[] Freq = new int[100001];
        int left = 0;
        long sum = 0;
        long maxSum = 0;
        int distinct = 0;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            if(Freq[nums[right]]++==0){
                distinct++;
            }
            if(right - left + 1 >k){
                sum-=nums[left];
                if(--Freq[nums[left]]==0){
                    distinct--;
                }
                left++;
            }
            if(right - left +1 == k && distinct == k){
                maxSum = Math.max(maxSum , sum);
            }
           
            
        }
        return maxSum;
    }
}