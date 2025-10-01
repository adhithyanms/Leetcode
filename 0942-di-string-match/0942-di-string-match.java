class Solution {
    public int[] diStringMatch(String s) {
        int I=0,D=s.length(),n=s.length(),index=0;
        int arr[]=new int[D+1];
        for(char c:s.toCharArray()){
            if(c=='I'){
                 arr[index++]=I++;
            }
            else{
                arr[index++]=D--;
            }
        }
        if(s.charAt(n-1)=='I'){
            arr[n]=I;
        }
        else{
            arr[n]=D;
        }
        return arr;
    }
}