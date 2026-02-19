class Solution {
    public int countBinarySubstrings(String s) {
        int Count = 0;
        int previousCount = 0;
        int currentCount = 1;
        for(int i = 1; i< s.length() ;i++){
            if(s.charAt(i)==s.charAt(i-1)){
                currentCount++;
            }
            else{
                Count+=Math.min(previousCount,currentCount);
                previousCount = currentCount; 
                currentCount = 1;
            }
        }
        Count+=Math.min(previousCount , currentCount);
        return Count;
    }
}