class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int nge [] = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        for(int i = nums.length*2-1 ;i>=0 ;i--){
            int current = nums[i%nums.length];
            while(!stack.isEmpty() && stack.peek()<=current){
                stack.pop();
            }
            if(i<nums.length){
                if(stack.isEmpty()){
                    nge[i]= -1;
                }
                else{
                    nge[i]= stack.peek();
                }
            }
            stack.push(current);
        }
        return nge;
    }
}