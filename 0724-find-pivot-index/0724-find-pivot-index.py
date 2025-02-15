class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        total,count=sum(nums),0
        for i in range(len(nums)):
            count+=nums[i]
            if total==count:
                return i
            total-=nums[i]
        return -1
        