class Solution {
    public boolean check(int[] nums) {
        boolean start = false;
        for(int i = 1 ;i<nums.length;i++){
            if(nums[i]>=nums[i-1]){
              continue;
            }else if (!start){
                start = true;
            }
            else{
                return false;
            }
        }
        if(start && nums[0]<nums[nums.length-1]){
            return false;
        }
        return true;
    }
}