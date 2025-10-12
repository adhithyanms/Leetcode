class Solution:
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
        tem=set(nums)
        result=[]
        for i in range(1,len(nums)+1):
            if i not in tem:
                result.append(i)
        return result
        