class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans="",tem=strs[0];
        int index=0;
        boolean check=true;
        while(check)
        {
            if (tem.length()<=index)
            {
                break;
            }
            for(String str:strs)
            {
                if (str.length()<=index || str.charAt(index)!=tem.charAt(index)){
                    check=false;
                    break;
                }
            }
            if(check)
            {
                ans+=tem.charAt(index);
                index+=1;
            }
        }
return ans;
    }
}