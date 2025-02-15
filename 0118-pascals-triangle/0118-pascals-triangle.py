class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        c=0
        ans=[]
        for i in range(0,numRows):
            c=1
            v=[]
            for j in range(0,i+1):
                c=int(c)
                v.append(c)
                c=c*(i-j)/(j+1)
            ans.append(v)
        return ans