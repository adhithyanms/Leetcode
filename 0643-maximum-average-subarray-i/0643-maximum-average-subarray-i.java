class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxAverage=Double.NEGATIVE_INFINITY;
        int sum=0,right=0,left=0;
        while(right<nums.length)
        {
            sum+=nums[right];
            if(right-left+1==k)
            {   double avg=sum/(double) k;
                maxAverage=Math.max(maxAverage,avg);
                sum-=nums[left];
                left++;
            }
        right++;
        }
        return maxAverage;
    }
}