class Solution {
    public String shortestPalindrome(String s) {
       String tem = new StringBuilder(s).reverse().toString();
       for(int i = 0 ;i<s.length();i++ )
       {
            if(s.startsWith(tem.substring(i))){
                return tem.substring(0,i)+s;
            }
       }
       return tem+s;
    }
}