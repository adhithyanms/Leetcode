class Solution {
    public int binaryGap(int n) {
        int max=0,flag=0,count=0;
        while(n>0)
        {
            if((n&1)==1){
                flag=1;
                max=Math.max(max,count);
                count=0;
            }
            if(flag==1){count++;}
            n>>=1; 
        }
        return max;

    }
}