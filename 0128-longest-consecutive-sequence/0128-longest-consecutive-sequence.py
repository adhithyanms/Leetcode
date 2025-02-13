class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if len(nums)<1:
            return 0
        nums=list(set(nums))
        nums.sort()
        ans,count=1,1
        for i in range(1,len(nums)):
            if nums[i-1]==nums[i]-1:
                count+=1
                ans=max(ans,count)
            else:
                count=1
        return ans