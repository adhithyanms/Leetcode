class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxAvg=-9999999;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        maxAvg=Math.max(maxAvg,(double)sum/k);
        System.out.print(maxAvg);
        for(int i=k;i<nums.length;i++){
            int newSum=sum-nums[i-k]+nums[i];
            maxAvg=Math.max(maxAvg,(double)newSum/k);
            sum=newSum;
        }
        return maxAvg;
    }
}