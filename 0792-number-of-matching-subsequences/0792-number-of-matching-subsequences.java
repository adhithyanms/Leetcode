class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        int ans = 0;
        for(String word : words){
            if(matching(word , s)){
                ans++;
            }
        }
        return ans;
    }
    public boolean matching(String word  , String s){
        int startIndex = 0;
        for(char c : word.toCharArray()){
            int index = s.indexOf(c , startIndex);
            if(index==-1){
                return false;
            }
            startIndex = index+1;
        }
        return true;
    }
}