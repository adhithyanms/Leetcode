class Solution {
    public int minSwaps(String s) {
        int balance = 0;
        int maxSwap = 0;
        for(char c:s.toCharArray()){
            if(c=='['){
                balance-=1;
            }else{
                balance+=1;
            }
            maxSwap = Math.max(maxSwap , balance);
        }
        return (maxSwap+1)/2;
    }
}