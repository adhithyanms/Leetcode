class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        s=""
        for i in digits:
            s+=str(i)
        ans=str(int(s)+1)
        change_digits=[]
        for i in ans:
            tem=int(i)
            change_digits.append(tem)
        return change_digits
        