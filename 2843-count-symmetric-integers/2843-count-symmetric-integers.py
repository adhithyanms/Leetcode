class Solution:
    def countSymmetricIntegers(self, low: int, high: int) -> int:
        count=0
        for i in range(low,high+1):
            tem=str(i)
            if len(tem)%2==0:
                left_sum=sum(int(num) for num in tem[:len(tem)//2])
                right_sum=sum(int(num) for num in tem[len(tem)//2:])
                if left_sum==right_sum:
                    count+=1
        return count