class Solution {
    public int characterReplacement(String s, int k) {
        int Freq[] = new int[26];
        int left = 0 , maxLength = 0 , maxFreq = 0;
        for(int right = 0;right<s.length();right++){
            Freq[s.charAt(right)-'A']++;
            maxFreq = Math.max(maxFreq , Freq[s.charAt(right)-'A']);
            if((right-left+1)-maxFreq>k){
                Freq[s.charAt(left)-'A']--;
                left++;
            }
            maxLength = Math.max(maxLength , right-left+1);
        }
        return maxLength;
    }
}