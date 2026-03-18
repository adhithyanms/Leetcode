class Solution {
    public int longestMountain(int[] arr) {
        int maxLength = 0;
        for(int i = 1 ; i<arr.length -1 ;i++){
            if(arr[i]> arr[i-1 ] && arr[i]>arr[i+1]){
                Stack<Integer> stack  = new Stack<>();
                int left = i ,right = i;
                while(left > 0 && arr[left]>arr[left-1]){
                    stack.push(arr[left]);
                    left--;
                }
                int len = stack.size()+1;
                while(right<arr.length-1 && arr[right]>arr[right+1]){
                    right++;
                    len++;
                }
                maxLength = Math.max(len , maxLength);
            }
        }
        return maxLength;
    }
}