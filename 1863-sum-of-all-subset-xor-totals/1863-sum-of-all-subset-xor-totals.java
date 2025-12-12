class Solution {
    public int subsetXORSum(int[] nums) {
        return findXor(nums,0,0);
    }
    public int findXor(int[] nums,int currentIndex,int currentValue){
        if(currentIndex==nums.length){
            return currentValue;
        }
        int with=findXor(nums,currentIndex+1,currentValue^nums[currentIndex]);
        int withOut=findXor(nums,currentIndex+1,currentValue);
        return with+withOut;
    }
}