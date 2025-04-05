class Solution:
    def uniqueOccurrences(self, arr: List[int]) -> bool:
        ans={}
        for i in arr:
            if i in ans:
                ans[i]+=1
            else:
                ans[i]=1
        return len(list(ans.values()))==len(set(list(ans.values())))

        