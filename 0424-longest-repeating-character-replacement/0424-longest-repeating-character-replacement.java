class Solution {
    public int characterReplacement(String s, int k) {
        int left=0,maxFreq=0,windSize=0,maxLength=0;
        int freq[]=new int[26];
        char c[]=s.toCharArray();
        for(int right=0;right<c.length;right++){
            freq[c[right]-'A']++;
            windSize=right-left+1;
            maxFreq=Math.max(maxFreq,freq[c[right]-'A']);
            if(windSize-maxFreq>k){
                freq[c[left]-'A']--;
                left++;
            }
            maxLength=Math.max(maxLength,right-left+1);
        }
        return maxLength;
    }
}