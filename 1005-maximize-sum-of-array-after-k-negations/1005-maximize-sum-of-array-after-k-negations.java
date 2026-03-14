class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i=0;i<nums.length && k>0;i++){
            if(nums[i]<0){
                k--;
                nums[i] = -nums[i];
            }
        }
        int minValue = Integer.MAX_VALUE;
        for(int i = 0 ;i<nums.length ;i++){
            sum+=nums[i];
            minValue = Math.min(nums[i] , minValue);
        }
        if(k%2==1){
            return sum - 2*minValue;
        }else{
            return sum;
        }

    }
}