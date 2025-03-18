class Solution:
    def replaceElements(self, arr: List[int]) -> List[int]:
        Max=arr[-1]
        arr[-1]=-1
        for i in range(len(arr)-2,-1,-1):
            tem=arr[i]
            arr[i]=Max
            if tem>Max:Max=tem
        return arr


        
        