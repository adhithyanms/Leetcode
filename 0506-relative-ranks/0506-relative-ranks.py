class Solution:
    def findRelativeRanks(self, score: List[int]) -> List[str]:
        scores=sorted(score,reverse=True)
        ans={}
        for i in range(len(score)):
            if i==0:
                ans[scores[i]]="Gold Medal"
            elif i==1:
                ans[scores[i]]="Silver Medal"
            elif i==2:
                ans[scores[i]]="Bronze Medal"
            else:
                ans[scores[i]]=str(i+1)
        result=[]
        for i in score:
            result.append(ans[i])
        return result