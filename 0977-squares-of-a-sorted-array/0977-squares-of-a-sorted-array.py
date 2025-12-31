class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        tem = [x*x for x in nums]
        return  sorted(tem)