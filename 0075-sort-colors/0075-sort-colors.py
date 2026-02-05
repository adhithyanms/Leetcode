class Solution:
    def sortColors(self, nums: List[int]) -> None:
        for i in range(len(nums)):
            for j in range(len(nums)):
                if nums[i]<nums[j] and i!=j:
                    tem=nums[i]
                    nums[i]=nums[j]
                    nums[j]=tem
        return nums
        