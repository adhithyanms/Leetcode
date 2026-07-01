class Solution {
    public String minWindow(String s, String t) {
        int minLength = Integer.MAX_VALUE;
        String ans = "";
        int left = 0;
        int Freq[] = new int[128];
        for(char c : t.toCharArray()){
            Freq[c-'A']++;
        }
        int count = t.length();
        for(int right = 0;right<s.length();right++){
            if(Freq[s.charAt(right)-'A']-->0){
                count--;
            }
            while(count == 0){
                if(right-left+1<minLength){
                    minLength = right-left+1;
                    ans = s.substring(left,right+1);
                }
                Freq[s.charAt(left)-'A']++;
                if(Freq[s.charAt(left)-'A']>0){
                    count++;
                }
                left++;
            }
        }
        return ans;
    }
}