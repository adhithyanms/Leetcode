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
        arr[n]=I;
        return arr;
    }
}