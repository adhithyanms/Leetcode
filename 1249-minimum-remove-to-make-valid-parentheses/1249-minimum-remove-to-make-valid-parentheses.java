class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else if (s.charAt(i) == ')') {
                if (!stack.isEmpty() && '(' == s.charAt(stack.peek())) {
                    stack.pop();
                } else {
                    stack.push(i);
                }
            }
        }
        StringBuilder ans = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            if (!stack.isEmpty()) {
                ans.delete(stack.peek(), stack.pop() + 1);
            }
        }
        return ans.toString();
    }
}