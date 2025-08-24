class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int maxLength=0,inc=1,dec=1;
        if(nums.length==0)return 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                   inc++;
                   dec=1;
            }
            else if(nums[i]<nums[i-1]){
                    dec++;
                    inc=1;
            }
            else{
                dec=inc=1;
            }
            maxLength=Math.max(maxLength,Math.max(inc,dec));
        }
        return maxLength;
    }
}