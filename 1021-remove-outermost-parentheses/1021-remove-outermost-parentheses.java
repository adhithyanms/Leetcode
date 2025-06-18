class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character>stack=new Stack<>();
        char[] str=s.toCharArray();
        int count=0;
       for(char c:str)
       {
        if(c=='(')
        {
            if(count>0)
            {stack.push(c);}
            count++;
        }
        else{
           count--;
           if(count>0)
           {
            stack.push(c);
           }
        }
       }
       StringBuilder ans=new StringBuilder();
       for(char c:stack)ans.append(c);
       return ans.toString();
    }
}