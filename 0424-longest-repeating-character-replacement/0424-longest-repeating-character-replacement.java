class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0,windowSize = 0, maxFreq = 0 , maxLength = 0;
        int[] Freq = new int[26];
        char[] c = s.toCharArray();
        for(int right = 0; right<s.length(); right++){
            Freq[c[right] - 'A']++;
            maxFreq = Math.max(maxFreq , Freq[c[right] - 'A']);
            if((right-left+1) - maxFreq > k){
                Freq[c[left] - 'A']--;
                left++;
            }
            maxLength = Math.max(maxLength , right-left+1);
        }
        return maxLength;
    }
}