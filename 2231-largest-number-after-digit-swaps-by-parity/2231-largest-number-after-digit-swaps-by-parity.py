class Solution:
    def largestInteger(self, num: int) -> int:
        nums=[int(d) for d in str(num)]
        odd=sorted([d for d in nums if d%2!=0],reverse=True)
        even=sorted([d for d in nums if d%2==0],reverse=True)
        ans=[]
        for d in nums:
            if d%2==0:
                ans.append(even.pop(0))
            else:
                ans.append(odd.pop(0))
        return int(''.join(map(str,ans)))