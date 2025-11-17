class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int n=nums.length;
        int least=-200;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
            if(i-least-1<k)return false;
            least=i;}
        }
        return true;
    }
}