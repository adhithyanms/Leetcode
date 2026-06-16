class Solution {
    public String processStr(String s) {
        StringBuilder ans = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c=='*'){
                if(ans.length()>=1){
                    ans.deleteCharAt(ans.length()-1);
                }
            }else if(c=='#'){
                ans.append(ans);
            }
            else if(c=='%'){
                ans.reverse();
            }else{
                ans.append(c);
            }
        }
        return ans.toString();
    }
}