class Solution:
    def getCommon(self, nums1: List[int], nums2: List[int]) -> int:
        set1=set(nums1)
        set2=set(nums2)
        set1 &=set2
        li=list(set1)
        li.sort()
        if len(li)==0:
            return -1
        else:
            return li[0]      