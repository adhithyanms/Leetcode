class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<ArrayList<Integer>> ans = new HashSet<>();
        Arrays.sort(nums);
        for(int i = 0;i<nums.length-2;i++){
            int left = i+1;
            int right = nums.length-1;
            while(left<right){
                int currentSum = nums[i]+nums[left]+nums[right];
                if(currentSum==0){
                    ans.add(new ArrayList<>(Arrays.asList(nums[i],nums[left],nums[right])));
                }
                if(currentSum<0){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return new ArrayList<>(ans);
    }
}