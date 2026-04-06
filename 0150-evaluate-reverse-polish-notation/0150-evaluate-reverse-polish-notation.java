class Solution {
    public int evalRPN(String[] tokens) {
    Stack<Integer> stack=new Stack<>();
    List<String> operations= Arrays.asList("+","-","/","*");
    for(String c:tokens){
        if(!operations.contains(c)){
            stack.push(Integer.parseInt(c));
        }
        else{
            int n2=stack.pop();
            int n1=stack.pop();
            switch(c){
                case "+":
                stack.push(n1+n2);
                break;
                case "-":
                stack.push(n1-n2);
                break;
                case "*":
                stack.push(n1*n2);
                break;
                case "/":
                stack.push(n1/n2);
                break;
            }
        }
    }
    return stack.pop();

    }  
}
