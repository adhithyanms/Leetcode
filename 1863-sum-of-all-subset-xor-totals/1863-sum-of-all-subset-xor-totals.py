class Solution:
    def subsetXORSum(self, nums: List[int]) -> int:
       return reduce(lambda x,y:x|y ,nums)*pow(2,len(nums)-1)
        