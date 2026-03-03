class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        permutation(nums,new ArrayList<>());
        return ans;
    }
    public void permutation(int [] nums , List<Integer> list){
        if(nums.length == list.size()){
            ans.add(new ArrayList<>(list));
            return;
        }   
        for(int i = 0;i<nums.length;i++){
            if(list.contains(nums[i])) continue;
            list.add(nums[i]);
            permutation(nums , list);
            list.remove(list.size()-1);
        }
    }
}