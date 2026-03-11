class Solution {
    public int bitwiseComplement(int n) {
        if(n == 0){
            return 1;
        }
        int tem=n;
        StringBuilder ans=new StringBuilder();
        while(tem!=0)
        {
            ans.append((tem%2==0)?"1":"0");
            tem/=2;
        }
         String ch=ans.reverse().toString();
        return Integer.parseInt(ch,2);
    }
}