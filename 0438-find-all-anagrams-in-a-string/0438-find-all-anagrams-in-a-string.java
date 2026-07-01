class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int pFreq[] = new int[26];
        int sFreq[] = new int[26];
        for(char c : p.toCharArray()){
            pFreq[c-'a']++;
        }
        List<Integer> ans = new ArrayList<>();
        int left = 0;
        for(int right = 0 ;right<s.length();right++){
            int len = right-left+1;
            sFreq[s.charAt(right)-'a']++;
            while(len>p.length()){
                sFreq[s.charAt(left++)-'a']--;
                len = right-left+1;
            }
            if(isAnagram(pFreq , sFreq)){
                ans.add(left);
            }
        }
        return ans;
    }
    static boolean isAnagram(int[]pFreq , int[]sFreq){
        for(int i = 0 ;i<26;i++){
            if(pFreq[i]!=sFreq[i]){
                return false;
            }
        }
        return true;
    }
}