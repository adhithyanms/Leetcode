class Solution {
    public int missingNumber(int[] nums) {
        int count=0;
        for(int num:nums)count+=num;
        return (nums.length*(nums.length+1)/2)-count;
    }
}