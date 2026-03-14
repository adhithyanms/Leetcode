class Solution {
    public String getHappyString(int n, int k) {
        ArrayList<String> ans = new ArrayList<>();
        get( n , k , "" , ans);
        if(ans.size()<k)return "";
        return ans.get(k-1);
    }
    public void get(int n , int k , String tem , ArrayList<String> ans){
        if(n==tem.length()){
            ans.add(tem);
            return;
        }
        for(char c : new char[]{'a','b','c'}){
            if(tem.length()>0 && tem.charAt(tem.length()-1) == c){
                continue;
            }
            get(n , k , tem+c ,ans);
        }
    }
}