class Solution:
    def findContentChildren(self, g: List[int], s: List[int]) -> int:
        cookies,child=0,0
        s.sort()
        g.sort()
        while cookies<len(s) and child<len(g):
            if s[cookies]>=g[child]:
                child+=1
            cookies+=1
        return child
        