class Solution:
    def sortArrayByParityII(self, nums: List[int]) -> List[int]:
        odd,even=1,0
        tem=[-1]*len(nums)
        for i in nums:
            if i%2==0:
                tem[even]=i
                even+=2
            else:
                tem[odd]=i
                odd+=2
        return tem
        