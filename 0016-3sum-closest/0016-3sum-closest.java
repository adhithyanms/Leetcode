class Solution {
    public int threeSumClosest(int[] nums, int target) {
       int colestSum=nums[0]+nums[1]+nums[2];
       int minDiffer=Integer.MIN_VALUE;
       Arrays.sort(nums);
       for(int i=0;i<nums.length-2;i++){
        int left=i+1;
        int right=nums.length-1;
        while(left<right){
            int sum=nums[i]+nums[left]+nums[right];
            minDiffer=Math.min(minDiffer,Math.abs(sum-target));
            if(sum==target){
                return sum;
            }
            if(sum>target){
                right--;
            }
            else{
               left++;
            }
        }
       }
       return colestSum;
    }
}