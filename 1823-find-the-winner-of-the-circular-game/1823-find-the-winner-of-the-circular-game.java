class Solution {
    public int findTheWinner(int n, int k) {
    ArrayList<Integer> ans=new ArrayList<>();
    for(int i=1;i<=n;i++)
    {
        ans.add(i);
    }
    Winner(ans,k,0);
    return ans.get(0);
    }
    public static void Winner(ArrayList<Integer> ans,int k,int index)
    {
        if(ans.size()==1)return;
        index=(index+k-1)%ans.size();
        ans.remove(index);
        Winner(ans,k,index);
    }

}