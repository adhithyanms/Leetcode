class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> ans = new ArrayList<>();
        dfs(0 , 0 ,n, "" ,ans);
        return ans;
    }
    public void dfs(int openP , int closeP , int n,String current , ArrayList<String> ans ){
        if(openP == closeP && closeP+openP == 2*n){
            ans.add(current);
            return ;
        }
        if(openP<n){
            dfs(openP+1 , closeP , n , current+"(" , ans);
        }
        if(closeP<openP){
            dfs(openP , closeP+1 , n , current+")" , ans);
        }
    }
}