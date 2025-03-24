class Solution:
    def minimumAverage(self, nums: List[int]) -> float:
        min_average=float('inf')
        nums.sort()
        start,end=0,len(nums)-1
        while start<end:
            min_average=min(min_average,(nums[start]+nums[end])/2)
            start+=1
            end-=1
        return min_average