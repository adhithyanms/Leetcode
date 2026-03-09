class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if(s.length() == 0) return 0;
        long ans = 0;
        int sign = 1;
        int i = 0;
        if(s.charAt(i)=='-' || s.charAt(i)=='+'){
            if(s.charAt(i)=='-'){
                sign = -1;
            }
            i++;
        }
        for(;i<s.length() ; i++){
            int n = Character.isDigit(s.charAt(i)) ? s.charAt(i) - '0' : -1;
            if(n>=0 && n<=9){
                ans = ans*10+n;
                if(ans*sign>Integer.MAX_VALUE) return Integer.MAX_VALUE;
                if(ans*sign<Integer.MIN_VALUE) return Integer.MIN_VALUE;
            }
            else{
                break;
            }
        }
    return (int)ans*sign;
    }
}