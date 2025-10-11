class Solution:
    def thirdMax(self, nums: List[int]) -> int:
        tem=sorted(list(set(nums)))
        if len(tem)>=3:
            return tem[len(tem)-3]
        else:
            return tem[len(tem)-1]

        