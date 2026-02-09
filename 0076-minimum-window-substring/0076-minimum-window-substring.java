class Solution {
    public String minWindow(String s, String t) {
     int Tset[]=new int[128];
     for(char c:t.toCharArray()){
        Tset[c]++;
     }
     int left=0;
     int minLength=Integer.MAX_VALUE;
     String ans="";
     int count=t.length();
     char c[]=s.toCharArray();
     for(int right=0;right<c.length;right++){
        if(Tset[c[right]]>0){
           count--;
        }
        Tset[c[right]]--;
        while(count==0){
            if(right-left+1<minLength){
                ans=s.substring(left,right+1);
                minLength=right-left+1;
            }
            Tset[c[left]]++;
            if(Tset[c[left]]>0){
                count++;
            }
           left++;
        }
     }
     return ans;
    }
}