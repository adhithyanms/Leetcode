class Solution:
    def minimumRightShifts(self, nums: List[int]) -> int:
        tem=sorted(nums)
        if tem==nums:
            return 0
        for i in range(len(nums)):
            nums=nums[-1:]+nums[:-1]
            if tem==nums:
                return i+1
        return -1
        