class Solution:
    def findMaxK(self, nums: List[int]) -> int:
        return max([num for num in set(nums) if num>0 and -num in nums],default=-1)
        