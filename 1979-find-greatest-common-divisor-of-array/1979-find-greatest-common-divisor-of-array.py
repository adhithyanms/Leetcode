class Solution:
    def findGCD(self, nums: List[int]) -> int:
        m=max(nums)
        n=min(nums)
        for i in range(m,1,-1):
            if n%i==0 and m%i==0:
                return i
        return 1

          