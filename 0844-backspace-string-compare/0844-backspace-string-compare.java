class Solution {
    public boolean backspaceCompare(String s, String t) {
        return backspace(t).equals(backspace(s));
    }
    public static String backspace(String str)
    {
        char ch[]=str.toCharArray();
        int start=0;
        for(char c:ch){
            if(c!='#'){
                ch[start++]=c;
            }else if(start>0){
                start--;
            }
        }
        return new String(ch,0,start);
    }
}