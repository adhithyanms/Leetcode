class Solution:
    def reverseStr(self, s: str, k: int) -> str:
        size,count,ans=0,0,""
        while size<len(s):
            cur=s[size:size+k]
            if count%2==0:
                ans+=cur[::-1]
            else:
                ans+=cur
            size+=k
            count+=1
        return ans
        