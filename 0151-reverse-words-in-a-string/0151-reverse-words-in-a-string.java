class Solution {
    public String reverseWords(String s) {
       String str[]=s.trim().split("\\s+");
       int left=0,right=str.length-1;
       while(left<right){
        String tem=str[left];
        str[left]=str[right];
        str[right]=tem;
        left++;
        right--;
       }
       return String.join(" ",str); 
    }
}