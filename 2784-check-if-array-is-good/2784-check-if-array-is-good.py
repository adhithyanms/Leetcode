class Solution:
    def isGood(self, nums: List[int]) -> bool:
        if nums.count(max(nums))==2:
            for i in range(1,max(nums)):
                if nums.count(i)!=1:
                    return False
            
            return True
        else:
            return False