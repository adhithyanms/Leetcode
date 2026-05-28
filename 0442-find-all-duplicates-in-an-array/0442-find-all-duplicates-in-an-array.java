class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();;;
        for(int n:nums)
        {
            map.put(n,map.getOrDefault(n,0)+1);
            if(map.get(n)==2)ans.add(n);
        }
         Collections.sort(ans);
         return ans;
    }
}