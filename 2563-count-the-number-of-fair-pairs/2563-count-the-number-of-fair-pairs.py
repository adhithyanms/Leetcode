class Solution:
    def countFairPairs(self, nums: List[int], lower: int, upper: int) -> int:
        nums.sort()
        n=len(nums)
        res=0
        for i in range(n):
            left=bisect_left(nums,lower-nums[i],i+1)
            right=bisect_right(nums,upper-nums[i],i+1)
            res+=right-left
        return res