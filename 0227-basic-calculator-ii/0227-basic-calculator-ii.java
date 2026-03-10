import java.util.*;

class Solution {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        s += "+";   // sentinel operator
        char op = '+';
        int n = 0;

        for(char c : s.toCharArray()) {

            if(c == ' ') {
                continue;
            }

            if(Character.isDigit(c)) {
                n = n * 10 + (c - '0');
                continue;
            }

            if(op == '+') stack.push(n);
            else if(op == '-') stack.push(-n);
            else if(op == '*') stack.push(stack.pop() * n);
            else if(op == '/') stack.push(stack.pop() / n);

            n = 0;
            op = c;
        }

        int ans = 0;
        for(int num : stack) {
            ans += num;
        }

        return ans;
    }
}