class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++)
        {
          if(nums[i]!=nums[i-1])
          {
            return nums[i-1];
          }
          else{i+=1;}
        }
    return nums[nums.length-1];
    }
}
