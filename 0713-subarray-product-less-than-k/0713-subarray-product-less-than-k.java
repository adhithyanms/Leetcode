class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1)return 0;
        int lessProductCount=0,left=0;
        long product=1;
        for(int right=0;right<nums.length;right++){
           product*=nums[right];
           while(product>=k){
             product/=nums[left++];
           }
           lessProductCount+=(right-left+1);
        }
        return lessProductCount;
    }
}