class Solution:
    def separateDigits(self, nums: List[int]) -> List[int]:
        ans=[]
        for num in nums:
            digits=map(int,str(num))
            ans.extend(digits)
        return ans