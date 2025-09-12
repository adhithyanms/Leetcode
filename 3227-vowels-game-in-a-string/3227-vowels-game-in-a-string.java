class Solution {
    public boolean doesAliceWin(String s) {
        for (char c : s.toCharArray()) {
            if (isvowel(c)) {
               return true;
            }
        }
        return false;
      
    }

    public boolean isvowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
