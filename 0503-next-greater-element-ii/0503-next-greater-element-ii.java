class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack= new Stack<>();
        int n=nums.length;
        int []nge=new int[n];
        for(int i=2*n-1;i>=0;i--){
            int current=nums[i%n];
            while(!stack.isEmpty() && current>=stack.peek()){
                stack.pop();
            }
            if(i<n){
                if(stack.isEmpty())nge[i]=-1;
                else nge[i]=stack.peek();
            }
            stack.push(current);
        }
        return nge;

    }
}