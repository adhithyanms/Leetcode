class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();
        for(char c :num.toCharArray()){
            while(!stack.isEmpty() && k>0 && c<stack.peek()){
                stack.pop();
                k--;
            }
            stack.push(c);
        }
        while(k-->0 && !stack.isEmpty()){
            stack.pop();
        }
        StringBuilder ans = new StringBuilder();
        for(char c : stack){
            ans.append(c);
        }
        while(ans.length()>0 && ans.charAt(0) == '0'){
            ans.deleteCharAt(0);
        }
        return ans.length() == 0 ?"0" : ans.toString();
    }
}