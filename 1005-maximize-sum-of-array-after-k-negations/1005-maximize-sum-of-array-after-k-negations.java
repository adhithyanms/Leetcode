class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        for(int i = 0;i<nums.length && k>0; i++){
            if(nums[i]<0){
                k--;
                nums[i] = -nums[i];
            }
        }
        int sum = 0 , minValue = Integer.MAX_VALUE;
        for(int n : nums){
            sum+=n;
            minValue = Math.min(minValue , n);
        }

        return k%2==1?sum-=2*minValue:sum;
    }
}