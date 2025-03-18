class Solution:
    def flipAndInvertImage(self, image: List[List[int]]) -> List[List[int]]:
        ans=[]
        for i in image:
            tem=[]
            for j in i:
                if j==0:
                    tem.append(1)
                else:
                    tem.append(0)
            ans.append(tem[::-1])
        return ans
                

        