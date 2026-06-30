class Solution {
    public String longestPalindrome(String s) {
        StringBuilder ans = new StringBuilder();
        int n = s.length();
        ans.append(s.charAt(0));
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(isPalindrom(s,i,j)){
                    if(j-i+1>ans.length()){
                        ans = new StringBuilder(s.substring(i,j+1));
                    }
                }
            }
        }
        return ans.toString();
    }
    public boolean isPalindrom(String s , int start , int end){
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}