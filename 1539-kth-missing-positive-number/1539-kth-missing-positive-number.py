class Solution:
    def findKthPositive(self, arr: List[int], k: int) -> int:
        current=1
        while k>0:
            if current not  in arr:
                k-=1
            if k==0:
                return current
            else:
                current+=1
        return -1