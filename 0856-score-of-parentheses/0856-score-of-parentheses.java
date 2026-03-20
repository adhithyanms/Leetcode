class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for(char c : s.toCharArray()){
            if(c=='('){
                stack.push(0);
            }else{
                int top = stack.pop();
                int value;
                if(top == 0){
                    value = 1;
                }
                else{
                    value = 2*top;
                }
                stack.push(stack.pop()+value);
            }
        }
        return stack.pop();
    }
}