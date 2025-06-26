class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] arr, int k) {
         List<Integer> tem=new ArrayList<>();
        combinationSum(arr,k,tem,0,0);
        return ans;
    }
    public void combinationSum(int[] arr,int k, List<Integer> tem,int index,int sum)
    {   
        if(sum>k)return ;
        if(sum==k)
        {
            ans.add(new ArrayList<>(tem));
            return ;
        }
        for(int i=index;i<arr.length;i++)
        {
            tem.add(arr[i]);
            combinationSum(arr,k,tem,i,sum+arr[i]);
            tem.remove(tem.size()-1);
        }
    }
}