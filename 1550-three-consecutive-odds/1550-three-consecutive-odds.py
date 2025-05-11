class Solution:
    def threeConsecutiveOdds(self, arr: List[int]) -> bool:
        oddCount=0
        for i in arr:
            if i%2==0:
                oddCount=0
                continue
            else:
                oddCount+=1
            if oddCount==3:
                return True
        return False
        