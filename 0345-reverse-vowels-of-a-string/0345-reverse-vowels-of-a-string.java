class Solution {
    public String reverseVowels(String str) {
        int left=0,right=str.length()-1;
        char s[]=str.toCharArray();
        while(left<right){
            if(isVowel(s[left]) && isVowel(s[right])){
                char tem=s[left];
                s[left]=s[right];
                s[right]=tem;
                left++;
                right--;
            }
            else if(!isVowel(s[left])){
                left++;
            }
            else if(!isVowel(s[right])){
                right--;
            }
        }
        return new String(s);
    }
    public boolean isVowel(char c){
        return c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' || c=='u' || c=='U';
    }
}