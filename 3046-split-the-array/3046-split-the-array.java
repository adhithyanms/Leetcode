class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        List<Integer> num=new ArrayList<>();
        for(int n:nums)num.add(n);
        for(Integer n:num)if(Collections.frequency(num,n)>2)return false;
        return true;
    }
}