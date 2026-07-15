class Solution {
    public String decodeString(String s) {
        StringBuilder ans = new StringBuilder();
        Stack<Integer> sNum = new Stack<>();
        StringBuilder str = new StringBuilder();
        Stack<StringBuilder> sSb = new Stack<>();
        int n = 0;
        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                n = n*10+(c-'0');
            }
            else if(c=='['){
                sNum.push(n);
                sSb.push(str);
                n=0;
                str = new StringBuilder();
            }else if(c==']'){
                int repeat = sNum.pop();
                StringBuilder current = sSb.pop();
                for(int i = 0 ;i<repeat;i++){
                    current.append(str);
                }
                str = current;
            }else{
                str.append(c);
            }
        }
        return str.toString();
    }
}