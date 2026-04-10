class Solution {
    public int minimumDistance(int[] nums) {
        int minLength = Integer.MAX_VALUE;
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    for(int k = j+1 ; k<nums.length;k++){
                        if(nums[k] == nums[j]){
                            minLength = Math.min(minLength , 2*(k-i));
                        }
                    }
                }
            }
        }
        return minLength == Integer.MAX_VALUE?-1:minLength;
    }
}