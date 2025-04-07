class Solution:
    def minimumOperations(self, nums: List[int]) -> int:
        if len(set(nums))==len(nums):
            return 0
        if len(nums)<3:
            return 1
        count=0
        while len(nums)>=3:
            nums=nums[3:]
            count+=1
            if len(set(nums))==len(nums):
                return count
            if len(nums)<3:
                count+=1
        return count
        