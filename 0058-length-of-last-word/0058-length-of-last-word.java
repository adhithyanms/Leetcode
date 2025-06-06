class Solution {
    public int lengthOfLastWord(String s) {
        String[] change=s.split(" ");
        for(int i=change.length-1;i>=0;i--)
        {
            if(!change[i].isEmpty())
            {
                return change[i].length();
            }
        }
        return 0;
    }
}