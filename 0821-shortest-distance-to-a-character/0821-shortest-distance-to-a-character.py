class Solution:
    def shortestToChar(self, s: str, c: str) -> List[int]:
        distance=[]
        ans=[]
        for i in range(len(s)):
                if s[i]==c:
                    distance.append(i)
        for i in range(len(s)):
            closest=[]
            for j in distance:
                closest.append(abs(i-j))
            ans.append(min(closest))
        return ans
        