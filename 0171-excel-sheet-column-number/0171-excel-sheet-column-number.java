class Solution {
    public int titleToNumber(String columnTitle) {
        int ans=0;
        for(int i=0;i<columnTitle.length();i++)
        {
            ans=ans*26+((int)columnTitle.charAt(i)-(int)'A'+1);
        }
        return ans;
    }
}