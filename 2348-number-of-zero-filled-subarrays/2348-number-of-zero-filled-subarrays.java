class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans=0,streak=0;
        for(int num:nums){
            streak=(num==0)?streak+1:0;
            ans+=streak;
        }
        return ans;
    }
}