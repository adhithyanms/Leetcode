class Solution:
    def dominantIndex(self, nums: List[int]) -> int:
        return nums.index(max(nums)) if max(nums)>=2*sorted(nums)[-2] else -1
        


