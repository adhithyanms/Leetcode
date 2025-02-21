class Solution(object):
    def largestNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: str
        """
        for i in range(len(nums)):
            nums[i] = str(nums[i])
        
        nums.sort(reverse=True, key=lambda x: (x*10))

        try:
            return str(int("".join(nums)))
        except:
            return "".join(nums)