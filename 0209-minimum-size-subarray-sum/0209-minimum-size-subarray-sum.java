class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLength=Integer.MAX_VALUE,currsum=0;
        int left=0;
        for(int right=0;right<nums.length;right++)
        {
           currsum+=nums[right];
           while(currsum>=target)
           {
            minLength=Math.min(minLength,right-left+1);
            currsum-=nums[left];
            left++;
           } 
        }
        return (minLength!=Integer.MAX_VALUE)?minLength:0;
    }
}