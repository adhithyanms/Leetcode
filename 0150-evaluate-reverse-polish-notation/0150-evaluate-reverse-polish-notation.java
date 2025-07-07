class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        List<String> operators = Arrays.asList("+", "-", "*", "/");

        for (String s : tokens) {
            if (!operators.contains(s)) {
                stack.push(Integer.parseInt(s));
            } else {
                int n2 = stack.pop();
                int n1 = stack.pop();

                switch (s) {
                    case "+":
                        stack.push(n1 + n2);
                        break;
                    case "-":
                        stack.push(n1 - n2);
                        break;
                    case "*":
                        stack.push(n1 * n2);
                        break;
                    case "/":
                        stack.push(n1 / n2);
                        break;
                }
            }
        }

        return stack.pop();
    }
}
