class Solution:
    def findDifference(self, nums1: List[int], nums2: List[int]) -> List[List[int]]:
        ans=[]
        tem=[]
        for num in nums1:
            if num not in nums2:
                tem.append(num)
        ans.append(list(set(tem)))
        tem=[]
        for num in nums2:
            if num not in nums1:
                tem.append(num)
        ans.append(list(set(tem)))
        return ans
                