class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
       List<Integer> tem=new ArrayList<>();
        combination(n,k,0,tem );
        return ans;
    }
    public  void combination(int n, int k, int index,List<Integer>tem)
    {
        if(tem.size()==k)
        {
            ans.add(new ArrayList<>(tem));
            return;
        }
        for(int i=index;i<n;i++)
        {
           tem.add(i+1);
           combination(n,k,i+1,tem);
           tem.remove(tem.size()-1);
        }
    }

}