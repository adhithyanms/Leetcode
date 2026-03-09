class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        return Math.max(robDP(0,nums.length-2 ,nums),robDP(1,nums.length-1, nums ));
    }
    public int robDP(int start , int end , int[] nums){
        int size = end - start +1;
        int []dp = new int[size];
        dp[0] = nums[start];
        if(size>1){
            dp[1] = Math.max(nums[start], nums[start+1]);
        }
        for(int i = 2 ; i<size; i++){
            dp[i]  = Math.max(dp[i-1] , dp[i-2]+nums[start+i]);
        }
        return dp[size-1];
    }
}