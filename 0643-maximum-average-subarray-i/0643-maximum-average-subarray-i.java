class Solution {
    public double findMaxAverage(int[] nums, int k) {
       double maxValue=Double.NEGATIVE_INFINITY;
       int left=0,right=0,sum=0;
       while(right<nums.length){
        sum+=nums[right];
        if(right-left+1==k){
            double avg=(double)sum/k;
            maxValue=Math.max(maxValue,avg);
            sum-=nums[left];
            left++;
        }
        right++;
       }
       return maxValue;
    }
}