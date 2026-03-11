class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        subset(nums, 0 , new ArrayList<>() , result);
        return result;
    }
    public void subset(int[] nums , int index , ArrayList<Integer> set , List<List<Integer>> result){
            result.add(new ArrayList<>(set));
        for(int i = index ;i<nums.length ;i++){
            set.add(nums[i]);
            subset(nums , i+1 , set , result);
            set.remove(set.size()-1);
            // subset(nums , i+1 , set , result);
        }
    }
}