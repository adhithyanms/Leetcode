class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder ans= new StringBuilder();
        for(String s:words){
            int sum=0;
            for(char c:s.toCharArray()){
                int index=(int)(c)-97;
                sum+=weights[index];
            }
            ans.append((char)(122-(sum%26)));
        }
        return ans.toString();
    }
}