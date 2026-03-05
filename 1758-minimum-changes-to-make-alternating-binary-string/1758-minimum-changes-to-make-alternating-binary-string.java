class Solution {
    public int minOperations(String s) {
        int flipFlop = 0,minOperation=0;
        for(int i = 0 ;i<s.length() ; i++ , flipFlop ^=1){
            if(s.charAt(i)-'0' == flipFlop){
                minOperation++;
            }
        }
        return Math.min(minOperation , s.length()-minOperation);
    }
}