class Solution:
    def distinctAverages(self, nums: List[int]) -> int:
        nums.sort()
        average=set()
        start,end=0,len(nums)-1
        while start<end:
            average.add((nums[start]+nums[end])/2)
            start+=1
            end-=1
            if start==end:
                average.append(nums[end])
        return len(average)
            
        